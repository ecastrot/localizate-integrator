/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.localizate.integration.controlt.services;

public interface ServiceSoap extends java.rmi.Remote {
    public java.lang.String login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String logout() throws java.rmi.RemoteException;
    public java.lang.String getCurrentInfoVehicle(java.lang.String licensePlate) throws java.rmi.RemoteException;
    public java.lang.String getListCurrentInfoVehicle(java.lang.String licensesPlate) throws java.rmi.RemoteException;
    public java.lang.String getCurrentInfoVehicleAndLogin(java.lang.String username, java.lang.String password, java.lang.String licensePlate) throws java.rmi.RemoteException;
    public java.lang.String insertEvent(java.lang.String lincesePlate, java.lang.String serial, java.lang.String dateEventGPS, java.lang.String hourEventGPS, java.lang.String dateEventAVL, java.lang.String hourEventAVL, boolean status, java.lang.String codeEvent, java.lang.String codeEventMessage, short priority, int velocity, float odometer, float longitude, float latitude, boolean ignition, short battery, float altitude, java.lang.String course, java.lang.String movil, short temperature1, short temperature2, java.lang.String address) throws java.rmi.RemoteException;
    public java.lang.String insertEventBulk(com.localizate.integration.controlt.services.InsertEvent[] items) throws java.rmi.RemoteException;
    public java.lang.String checkInsertEvent(java.lang.String lincesePlate, java.lang.String serial, java.lang.String dateEventGPS, java.lang.String hourEventGPS, java.lang.String dateEventAVL, java.lang.String hourEventAVL, boolean status, java.lang.String codeEvent, java.lang.String codeEventMessage, short priority, int velocity, float odometer, float longitude, float latitude, boolean ignition, short battery, float altitude, java.lang.String course, java.lang.String movil, short temperature1, short temperature2, java.lang.String city, java.lang.String department, java.lang.String username, java.lang.String address) throws java.rmi.RemoteException;
    public java.lang.String insertEventAndLogin(java.lang.String username, java.lang.String password, java.lang.String lincesePlate, java.lang.String serial, java.lang.String dateEventGPS, java.lang.String hourEventGPS, java.lang.String dateEventAVL, java.lang.String hourEventAVL, boolean status, java.lang.String codeEvent, java.lang.String codeEventMessage, short priority, int velocity, float odometer, float longitude, float latitude, boolean ignition, short battery, float altitude, java.lang.String course, java.lang.String movil, short temperature1, short temperature2, java.lang.String address, java.lang.String city, java.lang.String department) throws java.rmi.RemoteException;
    public java.lang.String insertEventAndLoginBulk(java.lang.String username, java.lang.String password, com.localizate.integration.controlt.services.InsertEvent[] items) throws java.rmi.RemoteException;
    public java.lang.String insertEventAndLoginQuick(java.lang.String username, java.lang.String password, java.lang.String lincesePlate, java.lang.String serial, java.lang.String dateEventGPS, java.lang.String hourEventGPS, java.lang.String dateEventAVL, java.lang.String hourEventAVL, boolean status, java.lang.String codeEvent, java.lang.String codeEventMessage, short priority, int velocity, float odometer, float longitude, float latitude, boolean ignition, java.lang.String city, java.lang.String department, short battery, float altitude, java.lang.String course, java.lang.String movil, short temperature1, short temperature2, java.lang.String address) throws java.rmi.RemoteException;
    public java.lang.String getRegister(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String getRegistersByLicensePlate(java.lang.String licensePlate, java.lang.String dateBeginStr, java.lang.String dateEndStr) throws java.rmi.RemoteException;
    public java.lang.String getListLicensesByProvider(java.lang.String username) throws java.rmi.RemoteException;
    public boolean vehicleHasReports(java.lang.String licensePlate) throws java.rmi.RemoteException;
    public boolean vehicleHasReportsInTime(java.lang.String licensePlate, java.lang.String time) throws java.rmi.RemoteException;
}
