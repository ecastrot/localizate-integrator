/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.localizate.integration.controlt.services;

public interface Service extends javax.xml.rpc.Service {
    public java.lang.String getServiceSoapAddress();

    public com.localizate.integration.controlt.services.ServiceSoap getServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.localizate.integration.controlt.services.ServiceSoap getServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
