package com.localizate.integration.services;

public class EventGps {
  
  private int order;
  
  private String code;

  private String description;

  private short level;
  
  public EventGps(int order, String code, String description, short level) {
    this.order = order;
    this.code = code;
    this.description = description;
    this.level = level;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getOrder() {
    return order;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  public short getLevel() {
    return level;
  }

  public void setLevel(short level) {
    this.level = level;
  }

  public boolean isOn() {
    //Si no es accOn enviar false
    return false;
  }

}
