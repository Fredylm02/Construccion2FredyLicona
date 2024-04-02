package app.controller;

import java.util.Scanner;


import app.dto.PersonDto;
import app.dto.PetsDto;
import app.service.VeterinaryService;
import app.service.VeterinaryanService;
import app.validators.PersonValidator;
import app.validators.petsValidator;

public class VeterinaryController {
private static PersonValidator personValidator = new PersonValidator () ;
private static petsValidator petsValidator = new petsValidator ();
private static Scanner reader = new Scanner(System.in);
private static VeterinaryService  veterinaryService = new VeterinaryanService();

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
    veterinaryService.createUser(personDto);
}
// Crear mascota
    public void createPets() throws Exception {
    	System.out.println(" Ingrese el id de la mascota ");
        Long id = petsValidator.idValidator(reader.nextLine());
    	System.out.println(" Ingrese el nombre de la mascota");
        String name = reader.nextLine();
        petsValidator.nameValidator(name);
        System.out.println(" Ingrese el ID del dueño ");
        Long ownerIdNumber = petsValidator.ownerIdNumberValidator(reader.nextLine());
        System.out.println(" Ingrese la edad de la mascota ");
        int age = petsValidator.ageValidator(reader.nextLine());
        System.out.println(" Ingrese la especie de la mascota (gato, perro) ");
        String species = reader.nextLine();
        petsValidator.speciesValidator(species);
        System.out.println(" Ingrese la raza de la mascota");
        String breed = reader.nextLine();
        petsValidator.speciesValidator(breed);
        System.out.println(" Ingrese las caracteristica de la mascota ");
        String characteristics = reader.nextLine();
        petsValidator.speciesValidator(characteristics);
        System.out.println(" Ingrese el peso de la mascota");
        int weight = petsValidator.weightValidator(reader.nextLine());
    	PetsDto petsDto = new PetsDto (id, name, ownerIdNumber, age, species, breed, characteristics, weight);
    
}
}
