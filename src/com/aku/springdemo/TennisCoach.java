package com.aku.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component("tennisCoach") by default the id is the class name first letter small
@Component
public class TennisCoach implements Coach {
	@Autowired
	public FortuneService fortuneService;
	

	public  TennisCoach() {
		// TODO Auto-generated constructor stub
		System.out.println(">> TennisCoach: Inside the default Constructor");
	}
	
	
	/*
	//Method Injection
	@Autowired
	public void doCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside the doCrazyStuff");
		this.fortuneService =fortuneService;
	}
	*/
	/*
	//Setter Injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside the setFortuneService");
		this.fortuneService = fortuneService;
	}
	*/

	/*// Constructor Injection
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice backend volley";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
