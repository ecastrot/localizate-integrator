package com.localizate.integration.controlt.services;

public class ServiceSoapProxy implements com.localizate.integration.controlt.services.ServiceSoap {
  private String _endpoint = null;
  private com.localizate.integration.controlt.services.ServiceSoap serviceSoap = null;
  
  public ServiceSoapProxy() {
    _initServiceSoapProxy();
  }
  
  public ServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceSoapProxy();
  }
  
  private void _initServiceSoapProxy() {
    try {
      serviceSoap = (new com.localizate.integration.controlt.services.ServiceLocator()).getServiceSoap();
      if (serviceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceSoap != null)
      ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.localizate.integration.controlt.services.ServiceSoap getServiceSoap() {
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap;
  }
  
  public java.lang.String login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.login(username, password);
  }
  
  public java.lang.String logout() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.logout();
  }
  
  public java.lang.String getCurrentInfoVehicle(java.lang.String licensePlate) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getCurrentInfoVehicle(licensePlate);
  }
  
  public java.lang.String getListCurrentInfoVehicle(java.lang.String licensesPlate) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getListCurrentInfoVehicle(licensesPlate);
  }
  
  public java.lang.String getCurrentInfoVehicleAndLogin(java.lang.String username, java.lang.String password, java.lang.String licensePlate) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getCurrentInfoVehicleAndLogin(username, password, licensePlate);
  }
  
  public java.lang.String insertEvent(java.lang.String lincesePlate, java.lang.String serial, java.lang.String dateEventGPS, java.lang.String hourEventGPS, java.lang.String dateEventAVL, java.lang.String hourEventAVL, boolean status, java.lang.String codeEvent, java.lang.String codeEventMessage, short priority, int velocity, float odometer, float longitude, float latitude, boolean ignition, short battery, float altitude, java.lang.String course, java.lang.String movil, short temperature1, short temperature2, java.lang.String address) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.insertEvent(lincesePlate, serial, dateEventGPS, hourEventGPS, dateEventAVL, hourEventAVL, status, codeEvent, codeEventMessage, priority, velocity, odometer, longitude, latitude, ignition, battery, altitude, course, movil, temperature1, temperature2, address);
  }
  
  public java.lang.String insertEventBulk(com.localizate.integration.controlt.services.InsertEvent[] items) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.insertEventBulk(items);
  }
  
  public java.lang.String checkInsertEvent(java.lang.String lincesePlate, java.lang.String serial, java.lang.String dateEventGPS, java.lang.String hourEventGPS, java.lang.String dateEventAVL, java.lang.String hourEventAVL, boolean status, java.lang.String codeEvent, java.lang.String codeEventMessage, short priority, int velocity, float odometer, float longitude, float latitude, boolean ignition, short battery, float altitude, java.lang.String course, java.lang.String movil, short temperature1, short temperature2, java.lang.String city, java.lang.String department, java.lang.String username, java.lang.String address) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.checkInsertEvent(lincesePlate, serial, dateEventGPS, hourEventGPS, dateEventAVL, hourEventAVL, status, codeEvent, codeEventMessage, priority, velocity, odometer, longitude, latitude, ignition, battery, altitude, course, movil, temperature1, temperature2, city, department, username, address);
  }
  
  public java.lang.String insertEventAndLogin(java.lang.String username, java.lang.String password, java.lang.String lincesePlate, java.lang.String serial, java.lang.String dateEventGPS, java.lang.String hourEventGPS, java.lang.String dateEventAVL, java.lang.String hourEventAVL, boolean status, java.lang.String codeEvent, java.lang.String codeEventMessage, short priority, int velocity, float odometer, float longitude, float latitude, boolean ignition, short battery, float altitude, java.lang.String course, java.lang.String movil, short temperature1, short temperature2, java.lang.String address, java.lang.String city, java.lang.String department) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.insertEventAndLogin(username, password, lincesePlate, serial, dateEventGPS, hourEventGPS, dateEventAVL, hourEventAVL, status, codeEvent, codeEventMessage, priority, velocity, odometer, longitude, latitude, ignition, battery, altitude, course, movil, temperature1, temperature2, address, city, department);
  }
  
  public java.lang.String insertEventAndLoginBulk(java.lang.String username, java.lang.String password, com.localizate.integration.controlt.services.InsertEvent[] items) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.insertEventAndLoginBulk(username, password, items);
  }
  
  public java.lang.String insertEventAndLoginQuick(java.lang.String username, java.lang.String password, java.lang.String lincesePlate, java.lang.String serial, java.lang.String dateEventGPS, java.lang.String hourEventGPS, java.lang.String dateEventAVL, java.lang.String hourEventAVL, boolean status, java.lang.String codeEvent, java.lang.String codeEventMessage, short priority, int velocity, float odometer, float longitude, float latitude, boolean ignition, java.lang.String city, java.lang.String department, short battery, float altitude, java.lang.String course, java.lang.String movil, short temperature1, short temperature2, java.lang.String address) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.insertEventAndLoginQuick(username, password, lincesePlate, serial, dateEventGPS, hourEventGPS, dateEventAVL, hourEventAVL, status, codeEvent, codeEventMessage, priority, velocity, odometer, longitude, latitude, ignition, city, department, battery, altitude, course, movil, temperature1, temperature2, address);
  }
  
  public java.lang.String getRegister(java.lang.String id) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getRegister(id);
  }
  
  public java.lang.String getRegistersByLicensePlate(java.lang.String licensePlate, java.lang.String dateBeginStr, java.lang.String dateEndStr) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getRegistersByLicensePlate(licensePlate, dateBeginStr, dateEndStr);
  }
  
  public java.lang.String getListLicensesByProvider(java.lang.String username) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getListLicensesByProvider(username);
  }
  
  public boolean vehicleHasReports(java.lang.String licensePlate) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.vehicleHasReports(licensePlate);
  }
  
  public boolean vehicleHasReportsInTime(java.lang.String licensePlate, java.lang.String time) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.vehicleHasReportsInTime(licensePlate, time);
  }
  
  
}