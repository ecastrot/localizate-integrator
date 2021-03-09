package com.localizate.integration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView home() {
	  ModelAndView model = new ModelAndView("home");
	  model.addObject("integrator", "ControlTransporte");
		return model;
	}

}
