package com.localizate.integration.controlt;

import java.util.TimerTask;

public class IntegrationControlTTask extends TimerTask {
  
  private int tries = 1;

  @Override
  public void run() {
    System.out.println("Here, select to db >>> " + tries);
    tries++;
  }

}
