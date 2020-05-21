package Section2Problem7;

public class Customer {

	private int id; 
	private String name; 
	private int discount; 
	
	Customer(int rId, String rName, int rDiscount) {
		id = rId; 
		name = rName; 
		discount = rDiscount; 
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name; 
	}
	
	public int getDiscount() {
		return discount; 
	}
	
	public void setDiscount(int rDiscount) {
		this.discount = rDiscount; 
	}
	
	public String toString() {
		return name + "(" + id + ")";
	}
	
}
