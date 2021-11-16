package guru.springframework.sfgdimaster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.pets.PetService;
import guru.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdimaster.repository.EnglishGreetingRepository;
import guru.springframework.sfgdimaster.repository.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdimaster.services.ConstructorGreetingService;
import guru.springframework.sfgdimaster.services.I18nEnglishGreetingService;
import guru.springframework.sfgdimaster.services.I18nSpanishGreetingService;
import guru.springframework.sfgdimaster.services.PrimaryGreetingService;
import guru.springframework.sfgdimaster.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdimaster.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile({"dog", "default"})
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Profile({"cat"})
	@Bean
	PetService catPetService(PetServiceFactory catServiceFactory) {
		return catServiceFactory.getPetService("cat");
	}	
	
	@Profile("ES")
	@Bean("i18nService") //overwrite method name with annotation
	I18nSpanishGreetingService i18nSpanishGreetingService() {
		return new I18nSpanishGreetingService();
	}
	
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}
	
	@Profile("EN")
	@Bean
	I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nEnglishGreetingService(englishGreetingRepository);
	}
	
	@Primary	
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
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
