package com.celia.log4jex;

import org.apache.log4j.Logger;

public class App {
	
	private static final Logger logger1 = Logger.getLogger(App.class.getName() + ".log1");
	private static final Logger logger2 = Logger.getLogger(App.class.getName() + ".log2");
	
	public static void main(String[] args) {
		logger1.info("test log1");
		logger2.info("test log2");
	}
}
