package com.aku.springdemo;

public class BaseballCoach implements Coach {
	
	//private field for dependency
	FortuneService fortuneService;

	//define constructor for the dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins doing batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
