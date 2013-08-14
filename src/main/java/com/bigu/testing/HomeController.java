package com.bigu.testing;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("fullName", "Sumit Arora" );
		
		return "home";
		
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Locale locale, Model model) {
		logger.info("Welcome hello!");
		return "hello";
}
	@RequestMapping(value = "/bigu", method = RequestMethod.GET)
	public String bigu(Locale locale, Model model) {
		logger.info("Bigu");
		model.addAttribute("myName", "Ruby Verma");
		return "bigu";
}
	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public String time(Locale locale, Model model) {
		logger.info("Time");
		Date today = new Date();
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	    String date = DATE_FORMAT.format(today);
		model.addAttribute("dateFormat", date);
		return "time";
}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model){
		logger.info("List");
		ArrayList al = new ArrayList();
		al.add("Item One");
		al.add("Item Two");
		al.add("Item Three");
		al.add("Item Four");
		al.add("Item Five");
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			model.addAttribute("listModel",element);
		}
		/*for(int i = 0; i<al.size(); i++){
			model.addAttribute("listModel", al.get(i));
		}*/
		return "list";
	}
	
}
