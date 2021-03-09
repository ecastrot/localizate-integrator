/**
 * InsertEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.localizate.integration.controlt.services;

public class InsertEvent  implements java.io.Serializable {
    private java.lang.String lincesePlate;

    private java.lang.String serial;

    /** Fecha en la que se genera el evento en el equipo GPS. El formato de fecha es MM/DD/AAAA*/
    private java.lang.String dateEventGPS;

    /** Hora en la que se genera el evento. El formato de fecha es hh:mm:ss y en formato 24hrs*/
    private java.lang.String hourEventGPS;

    /** Fecha en la que se recibe el evento en el equipo GPS. El formato de fecha es MM/DD/AAAA*/
    private java.lang.String dateEventAVL;

    /** Hora en la que se recibe el evento. El formato de fecha es hh:mm:ss y en formato 24hrs*/
    private java.lang.String hourEventAVL;

    private boolean status;

    private java.lang.String codeEvent;

    private java.lang.String codeEventMessage;

    private short priority;

    private int velocity;

    private float odometer;

    private float longitude;

    private float latitude;

    private boolean ignition;

    private short battery;

    private float altitude;

    private java.lang.String course;

    private java.lang.String movil;

    private java.lang.Short temperature1;

    private java.lang.Short temperature2;

    private java.lang.String address;

    private java.lang.String city;

    private java.lang.String department;

    public InsertEvent() {
    }

    public InsertEvent(
           java.lang.String lincesePlate,
           java.lang.String serial,
           java.lang.String dateEventGPS,
           java.lang.String hourEventGPS,
           java.lang.String dateEventAVL,
           java.lang.String hourEventAVL,
           boolean status,
           java.lang.String codeEvent,
           java.lang.String codeEventMessage,
           short priority,
           int velocity,
           float odometer,
           float longitude,
           float latitude,
           boolean ignition,
           short battery,
           float altitude,
           java.lang.String course,
           java.lang.String movil,
           java.lang.Short temperature1,
           java.lang.Short temperature2,
           java.lang.String address,
           java.lang.String city,
           java.lang.String department) {
           this.lincesePlate = lincesePlate;
           this.serial = serial;
           this.dateEventGPS = dateEventGPS;
           this.hourEventGPS = hourEventGPS;
           this.dateEventAVL = dateEventAVL;
           this.hourEventAVL = hourEventAVL;
           this.status = status;
           this.codeEvent = codeEvent;
           this.codeEventMessage = codeEventMessage;
           this.priority = priority;
           this.velocity = velocity;
           this.odometer = odometer;
           this.longitude = longitude;
           this.latitude = latitude;
           this.ignition = ignition;
           this.battery = battery;
           this.altitude = altitude;
           this.course = course;
           this.movil = movil;
           this.temperature1 = temperature1;
           this.temperature2 = temperature2;
           this.address = address;
           this.city = city;
           this.department = department;
    }


    /**
     * Gets the lincesePlate value for this InsertEvent.
     * 
     * @return lincesePlate
     */
    public java.lang.String getLincesePlate() {
        return lincesePlate;
    }


    /**
     * Sets the lincesePlate value for this InsertEvent.
     * 
     * @param lincesePlate
     */
    public void setLincesePlate(java.lang.String lincesePlate) {
        this.lincesePlate = lincesePlate;
    }


    /**
     * Gets the serial value for this InsertEvent.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this InsertEvent.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the dateEventGPS value for this InsertEvent.
     * 
     * @return dateEventGPS
     */
    public java.lang.String getDateEventGPS() {
        return dateEventGPS;
    }


    /**
     * Sets the dateEventGPS value for this InsertEvent.
     * 
     * @param dateEventGPS
     */
    public void setDateEventGPS(java.lang.String dateEventGPS) {
        this.dateEventGPS = dateEventGPS;
    }


    /**
     * Gets the hourEventGPS value for this InsertEvent.
     * 
     * @return hourEventGPS
     */
    public java.lang.String getHourEventGPS() {
        return hourEventGPS;
    }


    /**
     * Sets the hourEventGPS value for this InsertEvent.
     * 
     * @param hourEventGPS
     */
    public void setHourEventGPS(java.lang.String hourEventGPS) {
        this.hourEventGPS = hourEventGPS;
    }


    /**
     * Gets the dateEventAVL value for this InsertEvent.
     * 
     * @return dateEventAVL
     */
    public java.lang.String getDateEventAVL() {
        return dateEventAVL;
    }


    /**
     * Sets the dateEventAVL value for this InsertEvent.
     * 
     * @param dateEventAVL
     */
    public void setDateEventAVL(java.lang.String dateEventAVL) {
        this.dateEventAVL = dateEventAVL;
    }


    /**
     * Gets the hourEventAVL value for this InsertEvent.
     * 
     * @return hourEventAVL
     */
    public java.lang.String getHourEventAVL() {
        return hourEventAVL;
    }


    /**
     * Sets the hourEventAVL value for this InsertEvent.
     * 
     * @param hourEventAVL
     */
    public void setHourEventAVL(java.lang.String hourEventAVL) {
        this.hourEventAVL = hourEventAVL;
    }


    /**
     * Gets the status value for this InsertEvent.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this InsertEvent.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }


    /**
     * Gets the codeEvent value for this InsertEvent.
     * 
     * @return codeEvent
     */
    public java.lang.String getCodeEvent() {
        return codeEvent;
    }


    /**
     * Sets the codeEvent value for this InsertEvent.
     * 
     * @param codeEvent
     */
    public void setCodeEvent(java.lang.String codeEvent) {
        this.codeEvent = codeEvent;
    }


    /**
     * Gets the codeEventMessage value for this InsertEvent.
     * 
     * @return codeEventMessage
     */
    public java.lang.String getCodeEventMessage() {
        return codeEventMessage;
    }


    /**
     * Sets the codeEventMessage value for this InsertEvent.
     * 
     * @param codeEventMessage
     */
    public void setCodeEventMessage(java.lang.String codeEventMessage) {
        this.codeEventMessage = codeEventMessage;
    }


    /**
     * Gets the priority value for this InsertEvent.
     * 
     * @return priority
     */
    public short getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this InsertEvent.
     * 
     * @param priority
     */
    public void setPriority(short priority) {
        this.priority = priority;
    }


    /**
     * Gets the velocity value for this InsertEvent.
     * 
     * @return velocity
     */
    public int getVelocity() {
        return velocity;
    }


    /**
     * Sets the velocity value for this InsertEvent.
     * 
     * @param velocity
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }


    /**
     * Gets the odometer value for this InsertEvent.
     * 
     * @return odometer
     */
    public float getOdometer() {
        return odometer;
    }


    /**
     * Sets the odometer value for this InsertEvent.
     * 
     * @param odometer
     */
    public void setOdometer(float odometer) {
        this.odometer = odometer;
    }


    /**
     * Gets the longitude value for this InsertEvent.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this InsertEvent.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the latitude value for this InsertEvent.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this InsertEvent.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the ignition value for this InsertEvent.
     * 
     * @return ignition
     */
    public boolean isIgnition() {
        return ignition;
    }


    /**
     * Sets the ignition value for this InsertEvent.
     * 
     * @param ignition
     */
    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }


    /**
     * Gets the battery value for this InsertEvent.
     * 
     * @return battery
     */
    public short getBattery() {
        return battery;
    }


    /**
     * Sets the battery value for this InsertEvent.
     * 
     * @param battery
     */
    public void setBattery(short battery) {
        this.battery = battery;
    }


    /**
     * Gets the altitude value for this InsertEvent.
     * 
     * @return altitude
     */
    public float getAltitude() {
        return altitude;
    }


    /**
     * Sets the altitude value for this InsertEvent.
     * 
     * @param altitude
     */
    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }


    /**
     * Gets the course value for this InsertEvent.
     * 
     * @return course
     */
    public java.lang.String getCourse() {
        return course;
    }


    /**
     * Sets the course value for this InsertEvent.
     * 
     * @param course
     */
    public void setCourse(java.lang.String course) {
        this.course = course;
    }


    /**
     * Gets the movil value for this InsertEvent.
     * 
     * @return movil
     */
    public java.lang.String getMovil() {
        return movil;
    }


    /**
     * Sets the movil value for this InsertEvent.
     * 
     * @param movil
     */
    public void setMovil(java.lang.String movil) {
        this.movil = movil;
    }


    /**
     * Gets the temperature1 value for this InsertEvent.
     * 
     * @return temperature1
     */
    public java.lang.Short getTemperature1() {
        return temperature1;
    }


    /**
     * Sets the temperature1 value for this InsertEvent.
     * 
     * @param temperature1
     */
    public void setTemperature1(java.lang.Short temperature1) {
        this.temperature1 = temperature1;
    }


    /**
     * Gets the temperature2 value for this InsertEvent.
     * 
     * @return temperature2
     */
    public java.lang.Short getTemperature2() {
        return temperature2;
    }


    /**
     * Sets the temperature2 value for this InsertEvent.
     * 
     * @param temperature2
     */
    public void setTemperature2(java.lang.Short temperature2) {
        this.temperature2 = temperature2;
    }


    /**
     * Gets the address value for this InsertEvent.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this InsertEvent.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the city value for this InsertEvent.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this InsertEvent.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the department value for this InsertEvent.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this InsertEvent.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertEvent)) return false;
        InsertEvent other = (InsertEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lincesePlate==null && other.getLincesePlate()==null) || 
             (this.lincesePlate!=null &&
              this.lincesePlate.equals(other.getLincesePlate()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.dateEventGPS==null && other.getDateEventGPS()==null) || 
             (this.dateEventGPS!=null &&
              this.dateEventGPS.equals(other.getDateEventGPS()))) &&
            ((this.hourEventGPS==null && other.getHourEventGPS()==null) || 
             (this.hourEventGPS!=null &&
              this.hourEventGPS.equals(other.getHourEventGPS()))) &&
            ((this.dateEventAVL==null && other.getDateEventAVL()==null) || 
             (this.dateEventAVL!=null &&
              this.dateEventAVL.equals(other.getDateEventAVL()))) &&
            ((this.hourEventAVL==null && other.getHourEventAVL()==null) || 
             (this.hourEventAVL!=null &&
              this.hourEventAVL.equals(other.getHourEventAVL()))) &&
            this.status == other.isStatus() &&
            ((this.codeEvent==null && other.getCodeEvent()==null) || 
             (this.codeEvent!=null &&
              this.codeEvent.equals(other.getCodeEvent()))) &&
            ((this.codeEventMessage==null && other.getCodeEventMessage()==null) || 
             (this.codeEventMessage!=null &&
              this.codeEventMessage.equals(other.getCodeEventMessage()))) &&
            this.priority == other.getPriority() &&
            this.velocity == other.getVelocity() &&
            this.odometer == other.getOdometer() &&
            this.longitude == other.getLongitude() &&
            this.latitude == other.getLatitude() &&
            this.ignition == other.isIgnition() &&
            this.battery == other.getBattery() &&
            this.altitude == other.getAltitude() &&
            ((this.course==null && other.getCourse()==null) || 
             (this.course!=null &&
              this.course.equals(other.getCourse()))) &&
            ((this.movil==null && other.getMovil()==null) || 
             (this.movil!=null &&
              this.movil.equals(other.getMovil()))) &&
            ((this.temperature1==null && other.getTemperature1()==null) || 
             (this.temperature1!=null &&
              this.temperature1.equals(other.getTemperature1()))) &&
            ((this.temperature2==null && other.getTemperature2()==null) || 
             (this.temperature2!=null &&
              this.temperature2.equals(other.getTemperature2()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLincesePlate() != null) {
            _hashCode += getLincesePlate().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getDateEventGPS() != null) {
            _hashCode += getDateEventGPS().hashCode();
        }
        if (getHourEventGPS() != null) {
            _hashCode += getHourEventGPS().hashCode();
        }
        if (getDateEventAVL() != null) {
            _hashCode += getDateEventAVL().hashCode();
        }
        if (getHourEventAVL() != null) {
            _hashCode += getHourEventAVL().hashCode();
        }
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCodeEvent() != null) {
            _hashCode += getCodeEvent().hashCode();
        }
        if (getCodeEventMessage() != null) {
            _hashCode += getCodeEventMessage().hashCode();
        }
        _hashCode += getPriority();
        _hashCode += getVelocity();
        _hashCode += new Float(getOdometer()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += (isIgnition() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getBattery();
        _hashCode += new Float(getAltitude()).hashCode();
        if (getCourse() != null) {
            _hashCode += getCourse().hashCode();
        }
        if (getMovil() != null) {
            _hashCode += getMovil().hashCode();
        }
        if (getTemperature1() != null) {
            _hashCode += getTemperature1().hashCode();
        }
        if (getTemperature2() != null) {
            _hashCode += getTemperature2().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://controltrafico.com/", "InsertEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lincesePlate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "LincesePlate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEventGPS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "DateEventGPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourEventGPS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "HourEventGPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEventAVL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "DateEventAVL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourEventAVL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "HourEventAVL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "CodeEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeEventMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "CodeEventMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Velocity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odometer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Odometer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Ignition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("battery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Battery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "altitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("course");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Course"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Movil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperature1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Temperature1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperature2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "Temperature2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://controltrafico.com/", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
