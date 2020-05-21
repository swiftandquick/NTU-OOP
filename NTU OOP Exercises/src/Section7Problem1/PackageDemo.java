package Section7Problem1;

import java.util.*; // Scanner & Date.  

/** This program may not be entirely correct, as it seems each Customer contains m visits.  */
public class PackageDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); 
		
		String iName, iMemberType;
		boolean iMember; 
		double iServiceExpense, iProductExpense; 
		
		System.out.print("Customer:  ");
		iName = input.nextLine();

		/** Set the date to right now.  */
		Date iDate = new Date();
		
		/** Set up the name of the customer and date for the visit.  */
		Visit visit = new Visit(iName, iDate);
		
		/** Checks if the customer is a member.  If so, set up the member type.  */
		System.out.println("Is the customer a member?  Enter true or false.  ");
		iMember = input.nextBoolean(); 
		visit.setMember(iMember);
		if (visit.isMember()) {
			System.out.println("What kind of member is the customer?  Enter premium, gold, or silver.  ");
			input.nextLine();
			iMemberType = input.nextLine(); 
			visit.setMemberType(iMemberType);
		}
		
		System.out.print("Enter the original service expense:  $");
		iServiceExpense = input.nextDouble(); 

		System.out.print("Enter the original product expense:  $");
		iProductExpense = input.nextDouble(); 
		
		visit.setServiceExpense(iServiceExpense);
		visit.setProductExpense(iProductExpense);
		
		System.out.println("Service expense after sale:  $" + visit.getServiceExpense());
		System.out.println("Product expense after sale:  $" + visit.getProductExpense());
		
		System.out.println(visit); 
		
		input.close(); 
		
	}
	
}
