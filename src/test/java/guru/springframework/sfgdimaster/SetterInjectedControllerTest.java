package guru.springframework.sfgdimaster;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdimaster.controller.SetterInjectedController;
import guru.springframework.sfgdimaster.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void sertUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}
	
	@Test 
	void getGreeting() {
		System.out.println(controller.getGreeting());	
	}

}
