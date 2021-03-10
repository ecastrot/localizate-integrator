package com.localizate.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.localizate.integration.controlt.IntegrationControlTService;
import com.localizate.integration.controlt.data.IntegrationControlTData;
import com.localizate.integration.util.FormatUtil;


@Controller
public class HomeController {

  @Autowired
  private IntegrationControlTService integrationControlTService;

  @Autowired
  private IntegrationControlTData integrationControlTData;

  @RequestMapping("/")
  public ModelAndView home() {
    ModelAndView model = new ModelAndView("home");
    model.addObject("integrator", "ControlTransporte");
    model.addObject("plates", integrationControlTData.getControlTData().getPlates());
    model.addObject("synchronizing", integrationControlTService.isSynchronizing());
    model.addObject("lastSyncDate", FormatUtil.formatDateClient(integrationControlTService.getLastSyncDate()));
    return model;
  }

  @RequestMapping("/{plate}")
  public ModelAndView home(@PathVariable("plate")
  String plate) {
    this.integrationControlTData.controlPlate(plate);
    return home();
  }
}
