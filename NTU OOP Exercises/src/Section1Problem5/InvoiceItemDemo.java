package Section1Problem5;

import java.util.Scanner;

public class InvoiceItemDemo {

	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in); 
		
		String idInput;
		String descInput;
		int qtyInput;
		double unitPriceInput; 
		
		System.out.println("Please enter the information of the invoice:  ");
		System.out.print("ID:  ");
		idInput = input.next();
		System.out.print("Description:  ");
		descInput = input.next();
		System.out.print("Quantity:  ");
		qtyInput = input.nextInt();
		System.out.print("Unit Price:  $");
		unitPriceInput = input.nextDouble(); 
		
		InvoiceItem item = new InvoiceItem(idInput, descInput, qtyInput, unitPriceInput);
		
		System.out.println("Invoice Information:  ");
		System.out.println("ID:  " + item.getId());
		System.out.println("Description:  " + item.getDesc());
		System.out.println("Quantity:  " + item.getQty());
		System.out.println("Unit Price:  $" + item.getUnitPrice());
		
		System.out.println("Oops, sorry, wrong price.  ");
		System.out.println("What is the correct price?  ");
		unitPriceInput = input.nextDouble();
		item.setUnitPrice(unitPriceInput);
		System.out.println("The actual price is $" + item.getUnitPrice() + ".  "); 
		System.out.println("The total price is $" + item.getTotal() + ".  "); 
		
		input.close();
		
	}
	
}
