package com.bigu.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	public String save(HttpServletRequest request, Locale locale, Model model) throws Exception {
		  String firstName = "";
		  String lastName = "";
		  String email = "";
		  String department = "";
		  Integer phone = null;
		  Integer fax = null;
		  String address = "";
		  try {
			    firstName = ServletRequestUtils.getStringParameter(request, "firstName");
			    lastName = ServletRequestUtils.getStringParameter(request, "lastName");
			    email = ServletRequestUtils.getStringParameter(request, "email");
			    department = ServletRequestUtils.getStringParameter(request, "optionsRadios");
			    phone = ServletRequestUtils.getIntParameter(request, "phone");
			    fax = ServletRequestUtils.getIntParameter(request, "fax");
			    address = ServletRequestUtils.getStringParameter(request, "address");
			  } catch (ServletRequestBindingException e) {
			    e.printStackTrace();
			  }
		  
		  try{
			Class.forName("com.mysql.jdbc.Driver");  
		  }
		  catch(ClassNotFoundException e){
			  System.out.println("MySQL JDBC driver not found");
			  e.printStackTrace();
		  }
		  
		  Connection conn = null;
		  try{
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","");
		  }
		  catch(SQLException e){
			  e.printStackTrace();
		  }
		  
		  if(conn != null){
			  System.out.println("Connection Established");
		  }
		  else{
			  System.out.println("Connection Failed");
		  }
		  
		/*  String selectQuery = "select * from contacts";
		  Statement statement = conn.createStatement();
		  ResultSet rs = statement.executeQuery(selectQuery);
		  while(rs.next()){
			  Integer ID = rs.getInt("id");
				firstName = rs.getString("firstName");
				lastName = rs.getString("lastName");
				email = rs.getString("email");
				department = rs.getString("department");
				phone = rs.getInt("phone");
				fax = rs.getInt("fax");
				address = rs.getString("address");
				
				logger.info("id: {}",ID);
				logger.info("first name: {}",firstName);
				logger.info("last name: {}",lastName);
				logger.info("email: {}",email);
				logger.info("department: {}",department);
				logger.info("phone: {}",phone);
				logger.info("fax: {}",fax);
				logger.info("address: {}",address);
		  }
		  */
		  String insertQuery = "insert into contacts (firstName,lastName,email,department,phone,fax,address) values(?,?,?,?,?,?,?)";
		  PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
		  preparedStatement.setString(1,"firstName");
		  preparedStatement.setString(2,"lastName");
		  preparedStatement.setString(3,"email");
		  preparedStatement.setString(4,"department");
		  preparedStatement.setInt(5,phone);
		  preparedStatement.setInt(6,fax);
		  preparedStatement.setString(7,"address");
		  preparedStatement.executeUpdate();
		  
		  logger.info("save page {}", firstName);
		  logger.info("save page {}", lastName);
		  logger.info("save page {}",email);
		  logger.info("save page {}", department);
		  logger.info("save page {}", phone);
		  logger.info("save page {}", fax);
		  logger.info("save page {}", address);
		  model.addAttribute("firstname", firstName);
		  model.addAttribute("lastname", lastName);
		  model.addAttribute("email", email);
		  model.addAttribute("department",department);
		  model.addAttribute("phone",phone);
		  model.addAttribute("address",address);
		  model.addAttribute("fax",fax);
		  return "save";
		}
	
		
}
