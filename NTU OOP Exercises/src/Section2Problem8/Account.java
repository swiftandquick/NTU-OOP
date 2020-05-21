package Section2Problem8;

import java.util.Scanner;

public class Account {
	
	private int accountId;
	private Customer customer; 
	private double balance; 
	
	Account(int rAccountId, Customer rCustomer, double rBalance) {
		accountId = rAccountId; 
		customer = rCustomer; 
		balance = rBalance; 
	}
	
	Account(int rAccountId, Customer rCustomer) {
		accountId = rAccountId; 
		customer = rCustomer; 
		balance = 0;
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public double getBalance() {
		return balance; 
	}
	
	public void setBalance (double rBalance) {
		this.balance = rBalance; 
	}
	
	public String writeOutput() {
		return customer.toString() + "\nBank Account ID:  " + accountId + "\nCurrent Balance:  $" + balance; 
	}
	
	public String getCustomerName() {
		return customer.toString(); 
	}
	
	public Account deposit(double rAmount) {
		this.balance = this.balance + rAmount;
		return this; // Returns the current object of Account.  
	}
	
	public Account withdraw(double rAmount) {
		if (this.balance >= rAmount) {
			this.balance = this.balance - rAmount; 
			return this; // Returns the current object of Account.  
		}
		else {
			System.out.println("Amount withdrawn exceeds the current balance!  No change!  ");
			return this; // Returns the current object of Account.  
		}
	}
	
	
	/** Begins the main class.  */
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); 
		
		int iId, iAccountId; 
		double iBalance, iAmount; 
		String iName; 
		char iGender; 
		
		/** First account.  */
		System.out.println("Bank Account #1:  "); 
		System.out.print("Name:  "); 
		iName = input.nextLine();
		System.out.print("ID:  "); 
		iId = input.nextInt(); 
		System.out.print("Gender:  ");
		iGender = input.next().charAt(0); // Way to put in char.  
		while (!(iGender == 'm' || iGender == 'M' || iGender == 'f' || iGender == 'F')) {
			System.out.println("Please try again.  ");
			System.out.print("Gender:  ");
			iGender = input.next().charAt(0); 
		}
		
		Customer customer1 = new Customer(iId, iName, iGender);
		
		System.out.print("Account ID:  "); 
		iAccountId = input.nextInt(); 
		
		/** Since the balance variable is not pass into the parameter, balance is automatically set to 0.  */
		Account account1 = new Account(iAccountId, customer1);
		System.out.println("Current Balance:  $" + account1.getBalance());

		/** Change the value of balance using setter and deposit() methods.  */
		System.out.println("What is the balance?  "); 
		iBalance = input.nextDouble();
		while (iBalance < 0) {
			System.out.println("Balance must be positive.  ");
			System.out.println("What is the balance?  "); 
			iBalance = input.nextDouble();
		}
		account1.setBalance(iBalance);
		System.out.println("Current Balance:  $" + account1.getBalance()); 
		System.out.println("How much money do you want to deposit?  ");
		iAmount = input.nextDouble(); 
		while(iAmount < 0) {
			System.out.println("Please put in a positive number.  "); 
			iAmount = input.nextDouble(); 
		}
		account1.deposit(iAmount);
		System.out.println("Current Balance:  $" + account1.getBalance()); 
		System.out.println(account1.writeOutput());
		
		/** Second account.  */	
		System.out.println("\nBank Account #2:  "); 
		input.nextLine();
		System.out.print("Name:  "); 
		iName = input.nextLine();
		System.out.print("ID:  "); 
		iId = input.nextInt(); 
		System.out.print("Gender:  ");
		iGender = input.next().charAt(0); // Way to put in char.  
		while (!(iGender == 'm' || iGender == 'M' || iGender == 'f' || iGender == 'F')) {
			System.out.println("Please try again.  ");
			System.out.print("Gender:  ");
			iGender = input.next().charAt(0); 
		}
		
		Customer customer2 = new Customer(iId, iName, iGender);
		
		System.out.print("Account ID:  "); 
		iAccountId = input.nextInt(); 
		System.out.println("What is the balance?  "); 
		iBalance = input.nextDouble();
		while (iBalance < 0) {
			System.out.println("Balance must be positive.  ");
			System.out.println("What is the balance?  "); 
			iBalance = input.nextDouble();
		}
		
		/** Pass in all possible variables to the Account constructor.  */
		Account account2 = new Account(iAccountId, customer2, iBalance); 
		System.out.println("Current Balance:  $" + account2.getBalance());
		
		/** Try to withdraw money from the bank account.  */
		System.out.println("How much money do you want to withdraw?  ");
		iAmount = input.nextDouble();
		while(iAmount < 0) {
			System.out.println("Please put in a positive number.  "); 
			iAmount = input.nextDouble(); 
		}
		account2.withdraw(iAmount);

		System.out.println("Current Balance:  $" + account2.getBalance());
		System.out.print(account2.writeOutput());
		
		input.close(); 
		
	}
	
}
