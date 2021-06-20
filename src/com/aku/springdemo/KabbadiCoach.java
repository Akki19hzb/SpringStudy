package com.aku.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class KabbadiCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public KabbadiCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Perform Breath Practice for 15 mins daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
