package guru.springframework.sfgdimaster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.sfgdimaster.services.ConstructorGreetingService;
import guru.springframework.sfgdimaster.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdimaster.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {
	
	@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
	
}
