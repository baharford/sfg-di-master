package guru.springframework.sfgdimaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdimaster.services.GreetingService;
/* ------------------
THIS METHOD OF INJECTION IS NOT RECOMMENDED
------------------- */
@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
