package com.saran.DBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	
	private static final String jdbcurl = "jdbc:mysql://localhost:3306/perfdemodb?useSSL=false&serverTimezone=UTC";
	private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
	private static final String username = "springstudent";
	private static final String password = "springstudent";

	private static Connection conn = null;
	
	// Get the Database Connection
	public static Connection openConnection() {
		if(conn != null)
			return conn;
		else {
			try {
				Class.forName(DRIVER);
				conn = DriverManager.getConnection(jdbcurl, username, password);
				
			
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
	}
}
