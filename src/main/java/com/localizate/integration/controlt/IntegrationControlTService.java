package com.localizate.integration.controlt;

import java.util.Date;
import java.util.Timer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class IntegrationControlTService {

  @Value("${integration.controlt.time}")
  private long time;
  
  @Value("${integration.controlt.user}")
  private String user;

  @Value("${integration.controlt.pass}")
  private String pass;

  private IntegrationControlTTask task;

  @PostConstruct
  public void init() {
    task = new IntegrationControlTTask(user, pass);
    Timer timer = new Timer();
    timer.scheduleAtFixedRate(task, 0L, time);
  }

  public int getTries() {
    return task.getTries();
  }

  public boolean isSynchronizing() {
    return task.isSynchronizing();
  }
  
  public Date getLastSyncDate() {
    return task.getLastSyncDate();
  }
  
  

}
