package com.aku.springdemo;

import org.springframework.stereotype.Component;


//@Component("tennisCoach") by default the id is the class name first letter small
@Component
public class TennisCoach implements Coach {

	public  TennisCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside the default Constructor of TennisCoach");
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice backend volley";
	}

}
