package com.testAutomation.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {
	
private static boolean flag=false;
	
	public static <T> Logger getLogger(Class<T> cls){
		if(flag){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("src/test/resources/configFiles/log4j.properties");
		flag = true;
		return Logger.getLogger(cls);
	}
	
	public static void main(String[] args) {
		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
		log.info("I am test");
		log.info("I am test");
		log.info("I am test");
	}
}
