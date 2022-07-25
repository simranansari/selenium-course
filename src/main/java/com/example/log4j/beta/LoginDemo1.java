package com.example.log4j.beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginDemo1 {

	private static Logger log =LogManager.getLogger(LoginDemo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I have clicked on button");
		log.info("Button is displayed");
		log.error("Button is not displayed");
		log.fatal("Button is missing");
		
	}

}
