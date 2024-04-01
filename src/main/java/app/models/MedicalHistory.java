package app.models;

import java.sql.Date;

public class MedicalHistory {
	
private Date registerDate;
private String veterinaryMedical;
private String reasonforConsultation;
private String symptomatology;
private String pawing; // procedimiento
private String diagnostico;
private String medication;
private String doseofMedication;
private long Idorder;
private String vaccineHistory;
private String allergiesMedicines;
private String detailProcedure;
private String annulmentOrder;

public Date getRegisterDate() {
	return registerDate;
}
public void setRegisterDate(Date registerDate) {
	this.registerDate = registerDate;
}
public String getVeterinaryMedical() {
	return veterinaryMedical;
}
public void setVeterinaryMedical(String veterinaryMedical) {
	this.veterinaryMedical = veterinaryMedical;
}
public String getReasonforConsultation() {
	return reasonforConsultation;
}
public void setReasonforConsultation(String reasonforConsultation) {
	this.reasonforConsultation = reasonforConsultation;
}
public String getSymptomatology() {
	return symptomatology;
}
public void setSymptomatology(String symptomatology) {
	this.symptomatology = symptomatology;
}
public String getPawing() {
	return pawing;
}
public void setPawing(String pawing) {
	this.pawing = pawing;
}
public String getDiagnostico() {
	return diagnostico;
}
public void setDiagnostico(String diagnostico) {
	this.diagnostico = diagnostico;
}
public String getMedication() {
	return medication;
}
public void setMedication(String medication) {
	this.medication = medication;
}
public String getDoseofMedication() {
	return doseofMedication;
}
public void setDoseofMedication(String doseofMedication) {
	this.doseofMedication = doseofMedication;
}
public long getIdorder() {
	return Idorder;
}
public void setIdorder(long idorder) {
	Idorder = idorder;
}
public String getVaccineHistory() {
	return vaccineHistory;
}
public void setVaccineHistory(String vaccineHistory) {
	this.vaccineHistory = vaccineHistory;
}
public String getAllergiesMedicines() {
	return allergiesMedicines;
}
public void setAllergiesMedicines(String allergiesMedicines) {
	this.allergiesMedicines = allergiesMedicines;
}
public String getDetailProcedure() {
	return detailProcedure;
}
public void setDetailProcedure(String detailProcedure) {
	this.detailProcedure = detailProcedure;
}
public String getAnnulmentOrder() {
	return annulmentOrder;
}
public void setAnnulmentOrder(String annulmentOrder) {
	this.annulmentOrder = annulmentOrder;
}


}
