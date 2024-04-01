package app.dto;

public class PetsDto {
	private Long id;
    private String name;
    private Long ownerIdNumber; // ID dueño
    private int age;
    private String species;
    private String breed; // raza de mascota
    private String characteristics;
    private int weight;  // peso
    


	public PetsDto(Long id ,String name , Long ownerIdNumber, int age, String species, String breed,
		String characteristics, int weight) {
		super();
		this.id = id;
		this.name = name;
		this.ownerIdNumber = ownerIdNumber;
		this.age = age;
		this.species = species;
		this.breed = breed;
		this.characteristics = characteristics;
		this.weight = weight;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getOwnerIdNumber() {
		return ownerIdNumber;
	}
	public void setOwnerIdNumber(Long ownerIdNumber) {
		this.ownerIdNumber = ownerIdNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String 
	getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
    
    
}
