package com.safnas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user = "safnas";
		String pass = "Naaz@6581";
		
		try{
			System.out.println("Connecting to db");
			Connection connection = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection success");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
