package Section2Problem7;

import java.util.Scanner; 

public class Invoice {

	private int invoiceId;
	private Customer customer;
	private double amount; 
	
	Invoice(int rInvoiceId, Customer rCustomer, double rAmount) {
		invoiceId = rInvoiceId; 
		customer = rCustomer; 
		amount = rAmount; 
	}
	
	public int getInvoiceId() {
		return invoiceId; 
	}
	
	public Customer getCustomer() {
		return customer; 
	}
	
	public String getAmount() {
		return String.valueOf(amount); // Way to convert double to string.  
	}
	
	public void setAmount(double rAmount) {
		this.amount = rAmount; 
	}
	
	public String getCustomerName() {
		return customer.toString();
	}
	
	public double getAmountAfterDiscount() {
		return amount * (100 - customer.getDiscount()) / 100; 
	}
	
	
	/** Begin main method.  */
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); 
		
		String iName; 
		int iId, iDiscount, iInvoiceId;
		double iAmount; // This is the price.  
		
		System.out.print("Customer name:  "); 
		iName = input.nextLine();
		System.out.print("Customer ID:  "); 
		iId = input.nextInt();
		System.out.print("Customer Discount %:  "); 
		iDiscount = input.nextInt(); 
		while (iDiscount < 0 || iDiscount > 100) {
			System.out.println("Invalid discount range, please try again!  ");  
			System.out.print("Customer Discount %:  "); 
			iDiscount = input.nextInt(); 
		}
		
		Customer newCustomer = new Customer(iId, iName, iDiscount);
		
		System.out.print("Invoice ID:  ");
		iInvoiceId = input.nextInt();
		System.out.print("Cost:  $");
		iAmount = input.nextDouble();
		
		Invoice newInvoice = new Invoice(iInvoiceId, newCustomer, iAmount);
		
		System.out.println("Invoice #" + newInvoice.getInvoiceId() + ":  "); 
		System.out.println(newInvoice.getCustomerName()); 
		System.out.println("Original Cost:  $" + newInvoice.getAmount()); 
		System.out.println("Customer Discount:  " + newCustomer.getDiscount() + "%"); 
		System.out.println("Actual Cost:  $" + newInvoice.getAmountAfterDiscount());  
		
		input.close(); 
		
	}
	
}