package com.core.bean;

import com.core.services.FortuneService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CricketCoach implements ICoach {
	
	//reference name should be same as mentioned in the applicationContext.xml
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String teamName;
	
	private String userValue;
	
	public CricketCoach() {
		log.info("Default constructor called");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setting up FortuneService in CricketCoach through Setter Injection");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public void doWorkOut() {
		log.info("CricketCoach : Hit a SIX please!");
	}

	@Override
	public void getFortune() {
		System.out.println("CricketCoach() : You will hit a century today..!");
	}

	public void getEmailAddress() {
		System.out.println(emailAddress);
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void getTeamName() {
		System.out.println(teamName);
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the userValue
	 */
	public String getUserValue() {
		return userValue;
	}

	/**
	 * @param userValue the userValue to set
	 */
	public void setUserValue(String userValue) {
		this.userValue = userValue;
	}

}
