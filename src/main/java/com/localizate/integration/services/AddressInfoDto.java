package com.localizate.integration.services;

public class AddressInfoDto {

  private String lat;

  private String lon;

  private String category;

  private String type;

  private String addresstype;

  private String display_name;

  private AddressDto address;

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLon() {
    return lon;
  }

  public void setLon(String lon) {
    this.lon = lon;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getAddresstype() {
    return addresstype;
  }

  public void setAddresstype(String addresstype) {
    this.addresstype = addresstype;
  }

  public String getDisplay_name() {
    return display_name;
  }

  public void setDisplay_name(String display_name) {
    this.display_name = display_name;
  }

  public AddressDto getAddress() {
    return address;
  }

  public void setAddress(AddressDto address) {
    this.address = address;
  }

}
