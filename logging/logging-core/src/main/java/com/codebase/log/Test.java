package com.codebase.log;

import org.apache.log4j.Logger;

public class Test {

	final static Logger logger = Logger.getLogger(Test.class); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled()){
		    logger.debug("This is debug");
		}
	 
		//logs an error message with parameter
		logger.error("This is error ");
	 
		//logs an exception thrown from somewhere
		logger.error("This is error");

	}

}
