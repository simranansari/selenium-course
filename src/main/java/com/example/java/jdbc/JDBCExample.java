package com.example.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host="localhost";
		String port="5432";
		String database="mascot";
		String username="postgres";
		String password="postgres";
		String url="jdbc:postgresql://"+host+":"+port+"/"+database;
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from employeeinfo where name ='Edward'");
		
		while(rs.next())
		{
			System.out.println(rs.getString("age"));
			System.out.println(rs.getString("location"));

		}
				
				
	}

}
