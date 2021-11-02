package guru.springframework.sfgdimaster;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdimaster.controller.PropertyInjectedController;
import guru.springframework.sfgdimaster.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorGreetingService();
	}
	
	@Test
	void getGreetingTest() {
		System.out.println(controller.getGreeting());
	}

}
