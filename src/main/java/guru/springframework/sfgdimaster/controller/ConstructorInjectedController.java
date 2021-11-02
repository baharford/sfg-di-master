package guru.springframework.sfgdimaster.controller;

import guru.springframework.sfgdimaster.services.GreetingService;

/* ------------------
THIS IS THE MOST PREFERRED METHOD OF INJECTION
------------------- */

public class ConstructorInjectedController {
	private final GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
