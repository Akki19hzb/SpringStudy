package com.aku.springdemo;

public class BaseballCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins doing batting practice";
	}
}
