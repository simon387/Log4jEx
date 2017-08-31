package com.celia;

import org.apache.log4j.Logger;

public class App {
	
	private static final Logger appLogger = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		
		appLogger.info("start of running");
		System.out.println("end of runnning");
		
	}

}
