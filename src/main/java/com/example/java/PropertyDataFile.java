package com.example.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDataFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\DELL\\Documents\\my-project\\selenium-course\\src\\com\\exp\\java\\data.properties");
		prop.load(fis);	
		System.out.println(prop.getProperty("Hobbies"));
		System.out.println(prop.getProperty("city"));
		
		prop.setProperty("city", "London");
		System.out.println(prop.getProperty("city"));
		FileOutputStream fos =new FileOutputStream("C:\\Users\\DELL\\Documents\\my-project\\selenium-course\\src\\com\\exp\\java\\data.properties");
        prop.store(fos, null);
		
	
	
	
	
	}

}
