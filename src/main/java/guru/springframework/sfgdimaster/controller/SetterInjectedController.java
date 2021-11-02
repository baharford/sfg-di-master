package guru.springframework.sfgdimaster.controller;

import guru.springframework.sfgdimaster.services.GreetingService;
/* ------------------
THIS IS THE SECOND MOST PREFERRED METHOD OF INJECTION
------------------- */
public class SetterInjectedController {
	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
