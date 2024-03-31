package app.controller;

import java.util.Scanner;


import app.dto.PersonDto;

import app.service.VeterinaryService;
import app.service.VeterinaryanService;
import app.validators.PersonValidator;
import app.validators.petsValidator;

public class veterinaryController {
private static PersonValidator personValidator = new PersonValidator () ;
private static petsValidator petsValidator = new petsValidator ();
private static Scanner reader = new Scanner(System.in);
private static VeterinaryanService  veterinaryanService = new VeterinaryanService();

public static void createUser() throws Exception {
    System.out.println(" Ingrese el nombre completo ");
    String fullName = reader.nextLine();
    personValidator.fullNameValidator(fullName);
    System.out.println(" Ingrese la cedula del usuario ");
    Long id = personValidator.idValidator(reader.nextLine());
    System.out.println(" Ingrese la edad del ususario ");
    int age = personValidator.ageValidator(reader.nextLine());
    System.out.println(" Ingrese el rol de ususario ");
    String rol = reader.nextLine();
    personValidator.fullNameValidator(rol);
    System.out.println(" Ingrese el nombre de ususario ");
    String userName = reader.nextLine();
    personValidator.fullNameValidator(userName);
    System.out.println(" Ingrese la contraseña de ususario ");
    String password = reader.nextLine();
    personValidator.fullNameValidator(password);
    PersonDto personDto = new PersonDto(id, fullName, age, rol, userName, password);
    System.out.println(" Se cumplieron todas las validaciones ");
    veterinaryanService.createUser(personDto);
}

    public void createPets() throws Exception {
    	
    
}
}
