package com.aku.springdemo;

public class KabbadiCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public KabbadiCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
