package com.bigu.testing;

import java.util.*;


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

@RequestMapping("/admin")
@Controller
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		logger.debug("inside index method");
		return "home";
	}
}
