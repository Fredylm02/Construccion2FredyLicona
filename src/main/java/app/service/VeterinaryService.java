package app.service;

import app.dto.PersonDto;
import app.dto.PetsDto;


public interface VeterinaryService {
	
	public  void createUser(PersonDto personDto) throws Exception ;
	
	public  void createPets (PetsDto PetsDto) throws Exception ;

}

