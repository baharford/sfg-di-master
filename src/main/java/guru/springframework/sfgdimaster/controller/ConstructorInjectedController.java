package guru.springframework.sfgdimaster.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdimaster.services.GreetingService;

/* ------------------
THIS IS THE MOST PREFERRED METHOD OF INJECTION
------------------- */
@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
