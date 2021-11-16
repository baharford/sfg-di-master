package guru.springframework.sfgdimaster.services;

public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hellow world - From the Primary Bean";
	}

}
