package com.bigu.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.sql.PreparedStatement;
import java.util.Locale;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/db")
@Controller

public class DbController {

	private static final Logger logger = LoggerFactory.getLogger(DbController.class);
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String db(Locale locale, Model model){
		logger.info("db page");
		return "db";
		}
	/*
	@RequestMapping(value = "/test", method = RequestMethod.POST)
		public String test(HttpServletRequest request,Locale locale,Model model){
		String test = "";
		try{
			test = ServletRequestUtils.getStringParameter(request, "test");
		}
		catch(ServletRequestBindingException e){
			e.printStackTrace();
		}
		model.addAttribute("test",test);
		logger.info("test page {}", test);	
		return "test";
			}
	*/
	/* @RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testConnection(Locale locale, Model model) throws SQLException {

	try {
	  Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	  System.out.println("Where is your MySQL JDBC Driver?");
	  e.printStackTrace();
	}

	Connection conn = null;
	try {
	  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root", "");
	} catch (SQLException e) {
	  e.printStackTrace();
	}

	if (conn != null) {
	  System.out.println("You made it, take control your database now!");
	} else {
	  System.out.println("Failed to make connection!");
	}

	String selectTableSQL = "select * from users";
	Statement statement = conn.createStatement();
	ResultSet rs = statement.executeQuery(selectTableSQL);
	{
	while (rs.next()) {
	      Integer ID = rs.getInt("id"); 
	      
	      String email    = rs.getString("email");
	      String firstName  = rs.getString("firstName");
	      String lastName   = rs.getString("firstName");
	      
	      logger.info("id: {}",ID);
	      logger.info("email: {}", email);
	      logger.info("fname: {}", firstName);
	      logger.info("lname: {}", lastName );      
	 }  

	
	String insertTableSQL = "INSERT INTO users (ID, email, firstName, lastName) VALUES (?,?,?, ?)";
	PreparedStatement preparedStatement = conn.prepareStatement(insertTableSQL);
	preparedStatement.setInt(1,5);
	preparedStatement.setString(2, "newuser@email.com");
	preparedStatement.setString(3, "New User Fname");
	preparedStatement.setString(4, "New User Lname");
	preparedStatement .executeUpdate();
	
	
	String insertTableSQL = "update users set email = ? where id = ?";
	PreparedStatement preparedStatement = conn.prepareStatement(insertTableSQL);
	preparedStatement.setString(1, "updatednewuser@email.com");
	preparedStatement.setInt(2, 5);
	preparedStatement .executeUpdate();
	
	}
	
	
	logger.debug("inside index method");
	return "test";
	}*/

	/*	
		@RequestMapping(value = "/test", method = RequestMethod.GET)
		public String contactsConnection(Locale locale, Model model) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}	
		catch(ClassNotFoundException e){
				System.out.println("Where is your MYSql JDBC Driver ?");
				e.printStackTrace();
			}
		
		Connection conn = null;
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root", "");
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		if(conn != null){
			System.out.println("Connection successful");
		}
		else{
			System.out.println("Connection failed");
		} 
		
	
		String selectTableSQL = "select * from contacts";
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(selectTableSQL);
		{
		while(rs.next()){
			Integer ID = rs.getInt("id");
			String firstName = rs.getString("firstName");
			String lastName = rs.getString("lastName");
			String email = rs.getString("email");
			Integer phone = rs.getInt("phone");
			Integer fax = rs.getInt("fax");
			String address = rs.getString("address");
			
			logger.info("id: {}",ID);
			logger.info("first name: {}",firstName);
			logger.info("last name: {}",lastName);
			logger.info("email: {}",email);
			logger.info("phone: {}",phone);
			logger.info("fax: {}",fax);
			logger.info("address: {}",address);
		}	
		}
		
		
		
		String insertTableSQL = "insert into contacts (ID,firstName,lastName,email,phone,fax,address) values (?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(insertTableSQL);
		preparedStatement.setInt(1, 6);
		preparedStatement.setString(2, "d");
		preparedStatement.setString(3, "d");
		preparedStatement.setString(4, "d@mail.com");
		preparedStatement.setInt(5, 6);
		preparedStatement.setInt(6, 6);
		preparedStatement.setString(7, "d");
		preparedStatement.executeUpdate();
		
		
		String updateTableSQL = "update contacts set firstName = ? where id = ?";
		PreparedStatement preparedStatement2 = conn.prepareStatement(updateTableSQL);
		preparedStatement2.setString(1, "e");
		preparedStatement2.setInt(2,5);
		preparedStatement2.executeUpdate();
		
		String deleteTableSQL = "delete from contacts where id = ?";
		PreparedStatement preparedStatement3 = conn.prepareStatement(deleteTableSQL);
		preparedStatement3.setInt(1, 6);
		preparedStatement3.executeUpdate();
		
				logger.debug("inside index method");
				return "test";
		}
	*/
	
 
}

