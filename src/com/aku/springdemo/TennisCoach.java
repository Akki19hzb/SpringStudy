package com.aku.springdemo;

import org.springframework.stereotype.Component;


//@Component("tennisCoach") by default the id is the class name first letter small
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice backend volley";
	}

}
