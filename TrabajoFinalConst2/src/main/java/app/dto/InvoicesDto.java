package app.dto;

public class InvoicesDto { // Clase facturas
	    private int invoiceId; 
	    private int petId; 
	    private String ownerIdNumber;
	    private int orderId;
	    private String productName;
	    private double value;
	    private int quantity;
	    private String date;
		public int getInvoiceId() {
			return invoiceId;
		}
		public void setInvoiceId(int invoiceId) {
			this.invoiceId = invoiceId;
		}
		public int getPetId() {
			return petId;
		}
		public void setPetId(int petId) {
			this.petId = petId;
		}
		public String getOwnerIdNumber() {
			return ownerIdNumber;
		}
		public void setOwnerIdNumber(String ownerIdNumber) {
			this.ownerIdNumber = ownerIdNumber;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getValue() {
			return value;
		}
		public void setValue(double value) {
			this.value = value;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
	    
}
