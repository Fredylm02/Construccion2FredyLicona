package app.dto;

import app.models.Person;

public class PersonDto {
	 private Long id;
	 private String fullName;
	 private int age;
	 private String rol;
	 private String userName; 
	 private String password;
	 

	public PersonDto(Long id, String fullName, int age, String rol, String userName, String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.rol = rol;
		this.userName = userName;
		this.password = password;
	}



	public PersonDto(Person person) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.rol = rol;
		this.userName = userName;
		this.password = password;
	}




	public Long getId() {return id;
	}
	public void setId(Long id) {this.id = id;
	}
	public String getFullName() {return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



}
