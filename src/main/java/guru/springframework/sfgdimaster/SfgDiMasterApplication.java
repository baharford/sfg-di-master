package guru.springframework.sfgdimaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdimaster.controller.MyController;

@SpringBootApplication
public class SfgDiMasterApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiMasterApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		String greeting = myController.sayHello();
		
		System.out.println(greeting);
	}

}
