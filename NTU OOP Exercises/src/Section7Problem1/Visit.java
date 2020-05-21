package Section7Problem1;

import java.util.Date;

public class Visit {

	/** Date is a built in class, it can be used as an object.  */
	private Customer customer; 
	private Date date; 
	private double serviceExpense; 
	private double productExpense; 
	
	Visit(String rName, Date rDate) {
		customer = new Customer(rName); 
		date = rDate; 
	}
	
	public String getName() {
		return customer.getName(); 
	}
	
	/** This is not part of the requirement, but I need this method for the program to run.  */
	public boolean isMember() {
		return customer.isMember();
	}

	/** This is not part of the requirement, but I need this method for the program to run.  */
	public void setMember(boolean rMember) {
		customer.setMember(rMember); 
	}
	
	/** This is not part of the requirement, but I need this method for the program to run.  */
	public String getMemberType() {
		return customer.getMemberType(); 
	}
	
	/** This is not part of the requirement, but I need this method for the program to run.  */
	public void setMemberType(String rMemberType) {
		customer.setMemberType(rMemberType);  
	}
	
	public double getServiceExpense() {
		return serviceExpense; 
	}
	
	/** Get the final expense by applying discount to original expense.  */
	public void setServiceExpense(double rServiceExpense) {
		this.serviceExpense = rServiceExpense * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()));
	}
	
	public double getProductExpense() {
		return productExpense; 
	}

	/** Get the final expense by applying discount to original expense.  */
	public void setProductExpense(double rProductExpense) {
		this.productExpense = rProductExpense * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
	}
	
	public double getTotalExpense() {
		return serviceExpense + productExpense; 
	}
	
	public String toString() {
		return "Visit[" + customer.toString() + ", date = " + date + ", total expense = $" + (serviceExpense + productExpense) + "]"; 
	}
	
}
