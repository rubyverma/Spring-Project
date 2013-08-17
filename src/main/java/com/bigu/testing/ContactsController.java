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

@RequestMapping("/contacts")
@Controller
public class ContactsController {

	private static final Logger logger = LoggerFactory.getLogger(ContactsController.class);
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String contact(Locale locale, Model model) {
	  logger.debug("contact page");
	  return "contact";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(HttpServletRequest request, Locale locale, Model model) {
		  String name = "";
		  String mail = "";
		  try {
			    name = ServletRequestUtils.getStringParameter(request, "name");
			    mail = ServletRequestUtils.getStringParameter(request, "mail");
			  } catch (ServletRequestBindingException e) {
			    e.printStackTrace();
			  }
		  logger.info("save page {}", name);
		  logger.info("save page {}",mail);
		  model.addAttribute("name", name );
		  model.addAttribute("mail", mail);
		  return "save";
		}
}
