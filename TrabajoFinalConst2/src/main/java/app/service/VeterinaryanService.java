package app.service;

import java.util.Arrays;

import java.util.List;

import app.dao.PersonDao;
import app.dao.PersonDaoImpl;
import app.dto.PersonDto;
import app.controller.veterinaryController;
import app.controller.*;
import app.dto.PersonDto;

public class VeterinaryanService implements VeterinaryService {
	
	List<String> roles = Arrays.asList("Administrador", "Veterinario", "Vendedor ", "dueño", "Mascota");

	@Override
	public void createUser(PersonDto personDto) throws Exception {
		if (!roles.contains(personDto.getRol())) {
			throw new Exception("el rol no es valido");
		     }
			PersonDao personDao = new PersonDaoImpl();
			if (personDao.findUserExist(personDto)) {
				throw new Exception("ya existe un usuario con esa cedula");
			}
			if (personDao.existUserByUserName(personDto)) {
				throw new Exception("ya existe el usuario");
			}
			personDao.createPerson(personDto);
			System.out.println("se ha creado el usuario");
	
		
	}
}
	
		

