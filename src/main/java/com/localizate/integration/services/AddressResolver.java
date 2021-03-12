package com.localizate.integration.services;

import java.util.concurrent.TimeUnit;

import org.springframework.web.client.RestTemplate;

import com.localizate.integration.util.LocalizateRuntimeException;

public class AddressResolver {

  public static AddressInfoDto resolve(float longitude, float latitude) {
    RestTemplate restTemplate = new RestTemplate();
    AddressInfoDto result = restTemplate.getForObject("https://nominatim.openstreetmap.org/reverse?format=json&lon="+ longitude +"&lat=" + latitude, AddressInfoDto.class);
    try {
      TimeUnit.MILLISECONDS.sleep(30_000);
    } catch (InterruptedException e) {
      throw new LocalizateRuntimeException("Fallo espera consumo nominatim", e);
    }
    return result;
  }

}
