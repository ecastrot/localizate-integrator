package com.localizate.integration.controlt;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

import com.localizate.integration.controlt.services.InsertEvent;
import com.localizate.integration.controlt.services.ServiceSoapProxy;
import com.localizate.integration.services.AddressInfoDto;
import com.localizate.integration.services.AddressResolver;
import com.localizate.integration.services.EventGps;
import com.localizate.integration.services.EventResolver;
import com.localizate.integration.util.FormatUtil;
import com.localizate.integration.util.LocalizateRuntimeException;


public class IntegrationControlTTask extends TimerTask {

  private String user;

  private String pass;

  private boolean synchronizing = true;

  private Date lastSyncDate;

  private Set<String> plates;

  public IntegrationControlTTask(String user, String pass, Set<String> plates) {
    super();
    this.user = user;
    this.pass = pass;
    this.plates = plates;
  }

  private int tries = 1;

  @Override
  public void run() {
    //TODO iniciar last sync date, guardar esto en fisico
    this.lastSyncDate = FormatUtil.getDateFromString("2021-03-11 19:00:00", FormatUtil.FORMAT_DATE_CLIENT);
    System.out.println("Sync >> " + FormatUtil.formatDateClient(this.lastSyncDate));

    ServiceSoapProxy service = new ServiceSoapProxy();
    doLogin(service);
    List<InsertEvent> eventsToIntegrate = getEvents();
    sendEvents(service, eventsToIntegrate);
    doLogout(service);
  }

  private void doLogout(ServiceSoapProxy service) {
    try {
      String result = service.logout();
      System.out.println("Result logout >>> " + result);
    } catch (RemoteException e) {
      // TODO Que hacemos si falla el login
      e.printStackTrace();
    }
  }

  private void sendEvents(ServiceSoapProxy service, List<InsertEvent> eventsToIntegrate) {
    try {
      InsertEvent[] events = (InsertEvent[]) eventsToIntegrate.toArray();
      String retult = service.insertEventBulk(events);
      System.out.println("result events > " + retult);
    } catch (RemoteException e) {
      // TODO Que hacemos si falla el login
      e.printStackTrace();
    }
  }

  private void doLogin(ServiceSoapProxy service) {
    try {
      String result = service.login(user, pass);
      System.out.println("Result login >>> " + result);
    } catch (RemoteException e) {
      // TODO Que hacemos si falla el login
      e.printStackTrace();
    }
  }

  public List<InsertEvent> getEvents() {
    Connection conn = null;
    String url = "jdbc:sqlserver://ADMINISTRATOR2;databaseName=8833test";
    Statement stmt = null;
    ResultSet result = null;
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String databaseUserName = "wservice";
    String databasePassword = "WebServices123";
    try {
      Class.forName(driver).newInstance();
      conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
      stmt = conn.createStatement();
      result = null;
//      String carNO, machineNO, lon, lat, gpsTime, LastcommTime, status, simNO, mileage, temperature;
//      int speed, direction;
      
      String dateQuery = FormatUtil.formatDateClient(this.lastSyncDate);
      String query = "SELECT carNo, machineNO, lo, la, gpsTime, LastcommTime, status, speed, mileage, direction, simNO, temperature  FROM "
          + "tPosition_last INNER JOIN tCar on tPosition_last.carID = tCar.carID "
          + "WHERE carNO in (" + getPlatesQuery() + ") "
          + "AND LastcommTime IS NOT NULL AND LastcommTime > CONVERT(DATETIME, '" + dateQuery + "', 20) "
          + "ORDER BY LastcommTime ASC";
      result = stmt.executeQuery(query);

      List<InsertEvent> events = new ArrayList<>();
      while (result.next()) {
        InsertEvent event = new InsertEvent();
        event.setLincesePlate(result.getString("carNO"));
        event.setSerial(result.getString("machineNO"));
        event.setDateEventGPS(FormatUtil.formatDateForControlT(result.getDate("gpsTime")));
        event.setHourEventGPS(FormatUtil.formatTimeForControlT(result.getDate("gpsTime")));
        event.setDateEventAVL(FormatUtil.formatDateForControlT(result.getDate("LastcommTime")));
        event.setHourEventAVL(FormatUtil.formatTimeForControlT(result.getDate("LastcommTime")));
        event.setStatus(true);// Por defecto se debe de enviar 1
        EventGps eventGps = EventResolver.resolve(result.getString("status"));
        event.setCodeEvent(eventGps.getCode());
        event.setCodeEventMessage(eventGps.getDescription());
        event.setPriority(eventGps.getLevel());
        event.setVelocity(result.getInt("speed"));
        event.setOdometer(result.getFloat("mileage"));
        event.setIgnition(eventGps.isOn());
        event.setAltitude(0);// valor por defecto 0
        event.setTemperature1(result.getShort("temperature"));
        event.setTemperature2(result.getShort("temperature"));
        event.setMovil(result.getString("simNO"));
//        event.setBattery(null);//valor por defecto null
        event.setLongitude(result.getFloat("lo"));
        event.setLatitude(result.getFloat("la"));
        AddressInfoDto address = AddressResolver.resolve(event.getLongitude(), event.getLatitude());
        event.setCourse(address.getAddress().getState_district());
        event.setAddress(address.getDisplay_name());

        this.lastSyncDate = result.getDate("LastcommTime");
        events.add(event);
      }
      conn.close();
      return events;
    } catch (Exception e) {
      throw new LocalizateRuntimeException("No se pudo crear la lista de eventos, que hacemos?", e);
    }
  }

  private String getPlatesQuery() {
    StringBuilder stringPlates = new StringBuilder();
    this.plates.forEach(plate -> {
      stringPlates.append("'" + plate + "',");
    });
    stringPlates.deleteCharAt(stringPlates.length()-1);
    return stringPlates.toString();
  }

  public int getTries() {
    return this.tries;
  }

  public boolean isSynchronizing() {
    return this.synchronizing;
  }

  public Date getLastSyncDate() {
    return lastSyncDate;
  }

}

