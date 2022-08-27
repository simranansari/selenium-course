package com.example.selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.example.selenium.driverutility.BrowserName;
import com.example.selenium.driverutility.DriverUtility;

public class JDBCExamlne {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "5432";
		String database = "mascot";
		String username = "postgres";
		String password = "postgres";
		String url = "jdbc:postgresql://" + host + ":" + port + "/" + database;

		Connection con = DriverManager.getConnection(url, username, password);
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from employeeinfo where name ='Edward'");

		while (rs.next()) {
			
			WebDriver driver= DriverUtility.getDriver(BrowserName.CHROME);
			driver.get("https://login.salesforce.com");
			
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("age"));
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("location"));


		}

	}

}
