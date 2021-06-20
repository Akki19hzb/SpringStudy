package com.aku.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;


//@Component("tennisCoach") by default the id is the class name first letter small
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	//Field Injection
	@Qualifier("randomFortuneService")
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
	
	@PostConstruct
	public void doStartUpStuff() {
		System.out.println(">> Inside TenisCoach Startup Stuff");
	}
	
	@PreDestroy
	public void doCleanUpStuff() {
		System.out.println(">> Inside TennisCoach Cleanup Stuff");
	}
	
	
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
