package guru.springframework.sfgdimaster.controller;

import guru.springframework.sfgdimaster.services.GreetingService;
/* ------------------
THIS METHOD OF INJECTION IS NOT RECOMMENDED
------------------- */
public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
