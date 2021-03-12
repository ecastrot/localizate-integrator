package com.localizate.integration.controlt;

import java.util.Date;
import java.util.Timer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.localizate.integration.controlt.data.IntegrationControlTData;


@Service
public class IntegrationControlTService {
  
  @Autowired
  private IntegrationControlTData integrationControlTData;

  @Value("${integration.controlt.time}")
  private long time;
  
  @Value("${integration.controlt.user}")
  private String user;

  @Value("${integration.controlt.pass}")
  private String pass;

  private IntegrationControlTTask task;

  @PostConstruct
  public void init() {
    task = new IntegrationControlTTask(user, pass, integrationControlTData);
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
