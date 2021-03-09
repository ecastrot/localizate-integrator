package com.localizate.integration.controlt;

import java.rmi.RemoteException;
import java.util.TimerTask;

import com.localizate.integration.controlt.services.ServiceSoapProxy;


public class IntegrationControlTTask extends TimerTask {

  private String user;

  private String pass;

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

    ServiceSoapProxy s = new ServiceSoapProxy();
    try {
      String result = s.login(user, pass);
      System.out.println("Result login >>> " + result);
    } catch (RemoteException e) {
      // TODO Que hacemos si falla el login
      e.printStackTrace();
    }

  }

}
