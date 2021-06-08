/**
 * 
 */
package com.aku.springdemo;

/**
 * @author akash
 *
 */
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Declare fields
	private String emailAddress, team;
	
	public CricketCoach() {
		System.out.println("Inside the no-arg constructor of CricketCoach");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside the setter function of EmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Inside the setter function of Team");
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter function of CricketCoach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice daily Bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Cric Fortune: "+fortuneService.getFortune();
	}

}
