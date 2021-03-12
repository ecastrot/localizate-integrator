package com.localizate.integration.controlt.data;

import java.util.Set;


public class ControlTData {

  private String lastDateSync;

  private Set<String> plates;

  public Set<String> getPlates() {
    return plates;
  }

  public void setPlates(Set<String> plates) {
    this.plates = plates;
  }

  public String getLastDateSync() {
    return lastDateSync;
  }

  public void setLastDateSync(String lastDateSync) {
    this.lastDateSync = lastDateSync;
  }

}
