package com.localizate.integration.controlt;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;

import com.localizate.integration.controlt.data.IntegrationControlTData;
import com.localizate.integration.controlt.services.InsertEvent;
import com.localizate.integration.controlt.services.ServiceSoapProxy;
import com.localizate.integration.util.FormatUtil;


public class IntegrationControlTTask extends TimerTask {
  
  @Autowired
  private IntegrationControlTData integrationControlTData;

  private String user;

  private String pass;

  private boolean synchronizing = true;

  private Date lastSyncDate;

  public IntegrationControlTTask(String user, String pass) {
    super();
    this.user = user;
    this.pass = pass;
  }

  private int tries = 1;

  @Override
  public void run() {
    String p = "no";
    if (this.integrationControlTData != null) {
      p = this.integrationControlTData.getPlates();
    }else {
      p = "no";
    }
    System.out.println("plates >> " + p);
    
//    query();
    tries++;
    synchronizing = tries <= 5;
    // op1
    this.lastSyncDate = new Date();

//    ServiceSoapProxy s = new ServiceSoapProxy();
//    try {
//      String result = s.login(user, pass);
//      System.out.println("Result login >>> " + result);
//    } catch (RemoteException e) {
//      // TODO Que hacemos si falla el login
//      e.printStackTrace();
//    }

  }

  public void query() {

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
      String carNO, machineNO, lon, lat, gpsTime, status, simNO, mileage, temperature;
      int speed, direction;

      result = stmt.executeQuery(
          "select carNo, machineNO, lo, la, gpsTime, status, speed, mileage, direction, simNO, temperature  from tPosition_last, tCar where tPosition_last.carID = tCar.carID  and tlas....fecha > "
              + this.lastSyncDate);

      while (result.next()) {
        carNO = result.getString("carNO");
        machineNO = result.getString("machineNO");
        gpsTime = result.getString("gpsTime");
        status = result.getString("status");
        speed = result.getInt("speed");
        mileage = result.getString("mileage");
        lon = result.getString("lo");
        lat = result.getString("la");
        direction = result.getInt("direction");
        simNO = result.getString("simNO");
        temperature = result.getString("temperature");
        System.out.println(carNO + "," + machineNO + "," + gpsTime + "," + status + "," + speed + "," + mileage + "," + lon + "," + lat + "," + direction + ","
            + simNO + "," + temperature);
        // lastSyncDate = fecha mayor, la ultima fecha que sincronice

        InsertEvent event = new InsertEvent();
        event.setLincesePlate(result.getString("carNO"));
        event.setSerial(result.getString("machineNO"));
        event.setDateEventAVL(FormatUtil.formatDateForControlT(new Date()));

        ServiceSoapProxy s = new ServiceSoapProxy();
        try {
          String result2 = s.login(user, pass);
          System.out.println("Result login >>> " + result);
          InsertEvent events[] = new InsertEvent[] { event };
          s.insertEventBulk(events);
        } catch (RemoteException e) {
          // TODO Que hacemos si falla el login
          e.printStackTrace();
        }
      }
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
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
