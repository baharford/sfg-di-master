package guru.springframework.sfgdimaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdimaster.services.GreetingService;
/* ------------------
THIS IS THE SECOND MOST PREFERRED METHOD OF INJECTION
------------------- */
@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;

	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
