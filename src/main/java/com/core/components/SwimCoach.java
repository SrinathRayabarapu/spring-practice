package com.core.components;

import com.core.bean.ICoach;
import com.core.services.FortuneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

/**
 * java based configurations
 * 
 */
@Slf4j
public class SwimCoach implements ICoach {
	
	@Value("${data.emailId}")
	private String emailId;
	
	@Value("${data.teamName}")
	private String team;

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public SwimCoach() {
		log.info("Default constructor called");
	}

	@Override
	public void doWorkOut() {
		log.info("Swim coach is doing the workout!!");
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