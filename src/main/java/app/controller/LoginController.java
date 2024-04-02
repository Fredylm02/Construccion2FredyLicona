package app.controller;

import app.dto.PersonDto;
import java.util.Scanner;

import app.dto.PersonDto;
import app.service.VeterinaryanService;
import app.service.LoginService;
import app.validators.PersonValidator;

public class LoginController {
	private static Scanner reader = new Scanner(System.in);
	private static PersonValidator personValidator = new PersonValidator();
	private static LoginService loginService = new VeterinaryanService();
	private static VeterinaryController veterinaryController = new VeterinaryController();
	
	public void login() throws Exception {
		System.out.println("ingrese su usuario");
		String userName = reader.nextLine();
		personValidator.userNameValidator(userName);
		System.out.println("ingrese su contraseña");
		String password = reader.nextLine();
		personValidator.passwordValidator(password);
		PersonDto personDto = new PersonDto(userName, password);
		loginService.login(personDto);
		loginRouter(personDto);
		loginService.logout();
	}

	private void loginRouter(PersonDto personDto) {
		if (personDto.getRol().equals("Bibliotecario")) {
			VeterinaryController.session();
		} else {
			//movenmentController.session();
		}
	}
}
