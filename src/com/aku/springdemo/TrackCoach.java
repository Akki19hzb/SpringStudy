/**
 * 
 */
package com.aku.springdemo;

/**
 * @author akash
 *
 */
public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run hard 5 kms";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it "+fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: Inside Function doMyStartupStuff");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: Inside Function doMyCleantupStuff");
	}


}
