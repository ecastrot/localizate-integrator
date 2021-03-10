package com.localizate.integration.controlt;

import java.util.Date;
import java.util.TimerTask;


public class IntegrationControlTTask extends TimerTask {

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
    System.out.println("Here, select to db >>> " + tries);
    tries++;
    synchronizing = tries <= 5;
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
