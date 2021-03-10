package com.localizate.integration.controlt.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.localizate.integration.util.LocalizateRuntimeException;


@Service
public class IntegrationControlTData {

  @Value("${integration.controlt.dataPath}")
  private String dataPath;

  private ControlTData controlTData;

  @PostConstruct
  public void readData() {
    BufferedReader bufferedReader;
    try {
      bufferedReader = new BufferedReader(new FileReader(this.dataPath));
      Gson gson = new Gson();
      this.setControlTData(gson.fromJson(bufferedReader, ControlTData.class));
    } catch (FileNotFoundException e) {
      throw new LocalizateRuntimeException("No se pudo cargar los datos para las integraciones con control transporte", e);
    }
  }

  public void writeData() {
    try {
      Gson gson = new Gson();
      FileWriter fileWriter = new FileWriter(this.dataPath);
      gson.toJson(this.getControlTData(), fileWriter);
      fileWriter.close();
    } catch (IOException e) {
      throw new LocalizateRuntimeException("No se pudo escribir los datos para las integraciones con control transporte", e);
    }
  }

  public void controlPlate(String plate) {
    Set<String> plates = this.getControlTData().getPlates();
    if (plates == null) {
      plates = new HashSet<>();
    }
    if (plate.startsWith("-")) {
      String realPlate = plate.substring(1);
      plates.remove(realPlate);
    } else {
      plates.add(plate);
    }
  }

  public ControlTData getControlTData() {
    return controlTData;
  }

  public void setControlTData(ControlTData controlTData) {
    this.controlTData = controlTData;
  }

}
