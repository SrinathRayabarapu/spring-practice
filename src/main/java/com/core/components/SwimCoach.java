package com.core.components;

import com.core.bean.ICoach;
import com.core.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;

/**
 * java based configurations
 * 
 */
public class SwimCoach implements ICoach {
	
	@Value("${data.emailId}")
	private String emailId;
	
	@Value("${data.teamName}")
	private String team;

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public void doWorkOut() {
		System.out.println(getTeam()+ ", let's swim today.. 10 KMS!. Email me once you are done : " + getEmailId());
	}

	@Override
	public void getFortune() {
		this.fortuneService.getFortune();
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public String getTeam() {
		return team;
	}

}