package guru.springframework.pets;

//@Service
//@Profile({"dog", "default"})
public class DogPetService implements PetService {

	@Override
	public String getPetType() {
		return "Dogs are the best!";
	}
	
}
