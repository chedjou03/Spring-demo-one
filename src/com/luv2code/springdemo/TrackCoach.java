package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//define private field for the dependency
	private FortuneService fortuneService;
		
	//define default constructor
	public TrackCoach() {
	}

	//define constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do It "+fortuneService.getFortune();
	}

}
