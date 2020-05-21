package Section1Problem5;

public class InvoiceItem {

	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	InvoiceItem(String retrievedId, String retrievedDesc, int retrievedQty, double retrievedUnitPrice) {
		id = retrievedId;
		desc = retrievedDesc;
		qty = retrievedQty;
		unitPrice = retrievedUnitPrice; 
	}
	
	public String getId() {
		return id;
	}
	
	public String getDesc() {
		return desc; 
	}
	
	public int getQty() {
		return qty;
	}
	
	public double getUnitPrice() {
		return unitPrice; 
	}
	
	public void setUnitPrice(double newUnitPrice) {
		this.unitPrice = newUnitPrice; 
	}
	
	public double getTotal() {
		return unitPrice * qty;
	}
	
}
