package guru.springframework.sfgdimaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.sfgdimaster.controller.ConstructorInjectedController;
import guru.springframework.sfgdimaster.controller.I18nController;
import guru.springframework.sfgdimaster.controller.MyController;
import guru.springframework.sfgdimaster.controller.PetController;
import guru.springframework.sfgdimaster.controller.PropertyInjectedController;
import guru.springframework.sfgdimaster.controller.SetterInjectedController;

// must use ComponentScan as the "pets" package is outside of the package or sub-package where ASfgDiMasterApplication.java resides 
@ComponentScan(basePackages = {"guru.springframework.sfgdimaster", "guru.springframework.pets"} )
@SpringBootApplication
public class SfgDiMasterApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiMasterApplication.class, args);
		
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());
				
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-------- Primary Bean");
		System.out.println(myController.sayHello());
		
		System.out.println("-------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		
	}

}
