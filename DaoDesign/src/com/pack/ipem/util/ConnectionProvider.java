package com.pack.ipem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider
{
	private static Connection con= null;
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/";
		String db="ipem";
		String username="root";
		String password = "Raj@1539";
		
		try {
			Class.forName("comn.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException cf){
			System.out.println("pls load driver");
		}
		try {
			Connection con = DriverManager.getConnection(url+db,username,password);

		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
				System.out.println("Connection successful");
				return con;
	}
	

}
