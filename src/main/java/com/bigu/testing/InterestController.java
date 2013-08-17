package com.bigu.testing;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/interest")
@Controller
public class InterestController {

	private static final Logger logger = LoggerFactory.getLogger(InterestController.class);
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String interest(Locale locale, Model model) {
	  logger.info("interest page");
	  return "interest";
	}
	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public String calculate(HttpServletRequest request, Locale locale, Model model) {
		  float principal = 0;
		  float rate = 0;
		  float time = 0;
		  String type = "";
		  try {
			    principal = ServletRequestUtils.getFloatParameter(request, "principal");
			    rate = ServletRequestUtils.getFloatParameter(request, "rate");
			    time = ServletRequestUtils.getFloatParameter(request, "time");
			    type = ServletRequestUtils.getStringParameter(request, "optionsRadios");
			  } catch (ServletRequestBindingException e) {
			    e.printStackTrace();
			  }
		  logger.info("calcilate page {}", principal);
		  logger.info("calculate page {}",rate);
		  logger.info("calculate page {}",time);
		  logger.info("calculate page {}",type);
		  if("Simple".equals(type)){
		  float si = (principal*rate*time)/100;
		  model.addAttribute("interest",si);
		  }
		  else if("Compound".equals(type)){
			  float ci = (float) (principal*(Math.pow(1+rate/100,time)));
			  model.addAttribute("interest",ci);
		  }
		  return "calculate";
		}

}
