package com.localizate.integration.controlt;

import java.util.Timer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class IntegrationControlT {

  @Value("${integration.controlt.time}")
  private long time;

  @PostConstruct
  public void init() {
    IntegrationControlTTask task = new IntegrationControlTTask();
    Timer timer = new Timer();
    timer.scheduleAtFixedRate(task, 0L, time);
  }

}
