package guru.springframework.sfgdimaster.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.pets.PetService;

@Controller
public class PetController {

	private final PetService petService;
	
	public PetController(PetService petService) {
		this.petService = petService;
	}
	
	public String whichPetIsTheBest() {
		return petService.getPetType();
	}
}
