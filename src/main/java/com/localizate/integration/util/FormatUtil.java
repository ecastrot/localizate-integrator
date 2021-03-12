package com.localizate.integration.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * Clase utilitaria para formatear diferentes valores
 * @author ecastrot
 */
public class FormatUtil {
  public static final String FORMAT_DATE_CLIENT = "yyyy-MM-dd HH:mm:ss";

  public static final String FORMAT_DATE_CONTROL_T = "MM/dd/AAAA";
  
  public static final String FORMAT_TIME_CONTROL_T = "HH:mm:ss";
  
  /**
   * Formatea una fecha al formato de fechas definido para el cliente.
   * @param date fecha a formatear
   * @return fecha formateada, o nulo en caso de que no se reciba ninguna fecha
   */
  public static String formatDateClient(Date date) {
    return formatDateToSpecificFormat(date, FORMAT_DATE_CLIENT);
  }

  /**
   * Formatea una fecha al formato de fechas solicitado por Control Transporte.
   * @param date fecha a formatear
   * @return fecha formateada, o nulo en caso de que no se reciba ninguna fecha
   */
  public static String formatDateForControlT(Date date) {
    return formatDateToSpecificFormat(date, FORMAT_DATE_CONTROL_T);
  }
  
  /**
   * Formatea una fecha al formato de tiempo solicitado por Control Transporte.
   * @param date fecha a formatear
   * @return tiempo formateado, o nulo en caso de que no se reciba ninguna fecha
   */
  public static String formatTimeForControlT(Date date) {
    return formatDateToSpecificFormat(date, FORMAT_TIME_CONTROL_T);
  }

  /**
   * Formatea una fecha a un formato especifico
   * @param date fecha a formatear
   * @param format formato que se le aplicará a la fecha
   * @return fecha formateada, o nulo en caso de que no se reciba ninguna fecha
   */
  public static String formatDateToSpecificFormat(Date date, String format) {
    String formattedDate = "";
    try {
      SimpleDateFormat simpleFormat = new SimpleDateFormat(format, getDefaultLocale());
      formattedDate = simpleFormat.format(date);
    } catch (NullPointerException ne) {
      return null;
    } catch (Exception ex) {
      throw new LocalizateRuntimeException("No fue posible formatear la fecha " + date + " al formato " + format, ex);
    }
    return formattedDate;
  }

  /**
   * Obtiene una fecha desde un string con formato de fecha
   * @param date string desde el que se desea obtener la fecha
   * @param format formato que tiene el string
   * @return objeto date con la fecha obtenida
   */
  public static Date getDateFromString(String date, String format) {
    if (date == null) {
      return null;
    }
    SimpleDateFormat formatter = new SimpleDateFormat(format, getDefaultLocale());
    try {
      return formatter.parse(date);
    } catch (ParseException e) {
      return null;
    }
  }

  /**
   * Obtiene el locale por defecto para la aplicación
   * 
   * @return
   */
  public static Locale getDefaultLocale() {
    return new Locale("es", "ES");
  }

}
