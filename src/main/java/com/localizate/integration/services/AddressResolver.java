package com.localizate.integration.services;

import org.springframework.web.client.RestTemplate;

public class AddressResolver {

  public static AddressInfoDto resolve(float longitude, float latitude) {
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject("https://nominatim.openstreetmap.org/reverse?format=json&lon="+ longitude +"&lat=" + latitude, AddressInfoDto.class);
  }

}
