package app.service;

import java.util.Arrays;

import java.util.List;

import app.dao.PersonDao;
import app.dao.PersonDaoImpl;
import app.dto.PersonDto;
import app.dto.PetsDto;
import app.dto.SessionDto;
import app.controller.VeterinaryController;
import app.controller.*;
import app.dao.LoginDao;
import app.dao.LoginDaoImp;




public class VeterinaryanService implements VeterinaryService {
	
	List<String> roles = Arrays.asList("Administrador", "Veterinario", "Vendedor ", "dueño", "Mascota");
	private static long sessionId = 0L;
	
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

	@Override
	public void createPets(PetsDto PetsDto) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void setSesionID(long sesionId) {
		sessionId = sesionId;
	}
	
	@Override
	public void login(PersonDto personDto) throws Exception {
		PersonDao personDao = new PersonDaoImpl();
		PersonDto personDtoValidate = personDao.findUserByUserName(personDto);
		if (personDtoValidate == null) {
			throw new Exception("usuario no valido");
		}
		if (!personDto.getPassword().equals(personDtoValidate.getPassword())) {
			throw new Exception("usuario o contraseña incorrectos");
		}
		personDto.setRol(personDtoValidate.getRol());
		LoginDao loginDao = new LoginDaoImp();
		SessionDto sesionDto = loginDao.login(personDtoValidate);
		setSesionID(sesionDto.getId());
		System.out.println("se inicia la sesion " + sessionId);
		
		@Override
		public void logout() throws Exception {
			LoginDao loginDao = new LoginDaoImp();
			loginDao.logout(sessionId);
			setSesionID(0);
		
	}
}
	
		

