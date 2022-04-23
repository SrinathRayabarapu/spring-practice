package com.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Minstrel {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	public void singBefore(){
		logger.info("Singing before knight song....");
	}
	
	public void singAfter(){
		logger.info("Singing after same knight song....");
	}
}
