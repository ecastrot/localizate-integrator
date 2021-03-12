package com.localizate.integration.services;

import java.util.HashMap;
import java.util.Map;


public class EventResolver {

  private static final String DEFAULT_EVENT = "A";

  private static Map<String, EventGps> mapEvents = new HashMap<>();

  static {
    mapEvents.put("ACC ON", new EventGps(1, "ACC ON", "Vehiculo Encendido", (short) 2));
    mapEvents.put("ACC OFF", new EventGps(2, "ACC OFF", "Vehiculo Apagado", (short) 2));
    mapEvents.put("DOOR CLOSE", new EventGps(3, "DOOR CLOSE", "Puerta Cerrada", (short) 2));
    mapEvents.put("DOOR OPEN", new EventGps(4, "DOOR OPEN", "Puerta Abierta", (short) 2));
    mapEvents.put("GPS SIGNAL OK", new EventGps(5, "GPS SIGNAL OK", "Reporte Gps Valido", (short) 3));
    mapEvents.put("EXTERNAL POWER", new EventGps(6, "EXTERNAL POWER", "Desconexion de bateria", (short) 5));
    mapEvents.put("001", new EventGps(7, "001", "Reporte GPS", (short) 3));
    mapEvents.put("A", new EventGps(8, "A", "Dato Gps Valido", (short) 1));
  }

  // A,001,ACC on,door close
  public static EventGps resolve(String events) {
    EventGps eventResolved = mapEvents.get(DEFAULT_EVENT);
    String[] eventsArray = events.split(",");
    for (String event : eventsArray) {
      event = event.toUpperCase();
      EventGps eventTmp = mapEvents.get(event);
      if (eventTmp != null && eventTmp.getOrder() < eventResolved.getOrder()) {
        eventResolved = eventTmp;
      }
    }
    return eventResolved;
  }

}
