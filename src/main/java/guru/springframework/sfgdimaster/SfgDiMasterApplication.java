package guru.springframework.sfgdimaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdimaster.controller.ConstructorInjectedController;
import guru.springframework.sfgdimaster.controller.MyController;
import guru.springframework.sfgdimaster.controller.PropertyInjectedController;
import guru.springframework.sfgdimaster.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiMasterApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiMasterApplication.class, args);
		
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
