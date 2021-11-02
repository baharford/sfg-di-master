package guru.springframework.sfgdimaster;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdimaster.controller.ConstructorInjectedController;
import guru.springframework.sfgdimaster.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}
	
	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
