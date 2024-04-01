package app.dto;

import java.sql.SQLData;

public class OrderDto {
	private long orderId;
    private long petId; 
    private String veterinarianIdNumber; // cedula Veterinario
    private String medicationName;  //nombreMedicamento
    private SQLData generationDate; // fechaGeneracion
    
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getPetId() {
		return petId;
	}
	public void setPetId(long petId) {
		this.petId = petId;
	}
	public String getVeterinarianIdNumber() {
		return veterinarianIdNumber;
	}
	public void setVeterinarianIdNumber(String veterinarianIdNumber) {
		this.veterinarianIdNumber = veterinarianIdNumber;
	}
	public String getMedicationName() {
		return medicationName;
	}
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}
	public SQLData getGenerationDate() {
		return generationDate;
	}
	public void setGenerationDate(SQLData generationDate) {
		this.generationDate = generationDate;
	}
	
}
