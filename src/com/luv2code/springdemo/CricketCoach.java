package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	//create a no-argument constructor 
	public CricketCoach() {
		System.out.println("Inside the no-args constructor of the cricketCoach class");
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the Setter method : setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes a day";
	}

	
	@Override
	public String getDailyFortune() {
		
		return "Never Give Up "+fortuneService.getFortune();
	}

}
