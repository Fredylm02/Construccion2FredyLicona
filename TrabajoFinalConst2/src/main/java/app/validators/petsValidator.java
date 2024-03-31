package app.validators;

public class petsValidator  extends InputsValidator {
	public void nameValidator (String name) throws Exception {
		super.stringValidator(name, "Nombre de mascota");
	}
	
	public long ownerIdNumberValidator (String ownerIdNumber) throws Exception {
		return super.longValidator(ownerIdNumber, "Id del dueño");
	}
	public void ageValidator (String age) throws Exception {
		 super.stringValidator(age, " Edad de mascota ");
	}
	
	public void idValidator (String id) throws Exception {
		 super.longValidator(id, " Edad de mascota ");
	}
	public void speciesValidator (String species) throws Exception {
		 super.stringValidator(species, " Especie de mascota ");
	}
	public void breedValidator (String breed) throws Exception {
		 super.stringValidator(breed, " raza de mascota ");
	}
	public void characteristicsValidator (String characteristics) throws Exception {
		 super.stringValidator(characteristics, " raza de mascota ");
	}
	public long weightValidator (String weight) throws Exception {
		return super.longValidator(weight, " raza de mascota ");
	}
	
}
