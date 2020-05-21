package Section1Problem6;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		String idInput;
		String nameInput;
		int balanceInput;
		int balanceChange; 
		
		/** Set up first account.  */
		System.out.println("Bank Account #1:  "); 
		System.out.print("ID:  "); 
		idInput = input.next(); 
		System.out.print("Name:  ");
		nameInput = input.next(); 
		System.out.print("Balance:  "); 
		balanceInput = input.nextInt(); 
		
		Account account1 = new Account(idInput, nameInput, balanceInput);
		
		System.out.println("How much money do you want to put into your account?  ");
		balanceChange = input.nextInt();
		account1.credit(balanceChange);
		
		System.out.println("Your new balance is $" + account1.getBalance() + ".  ");
		
		
		/** Set up second account.  */
		System.out.println();
		System.out.println("Bank Account #2:  "); 
		System.out.print("ID:  "); 
		idInput = input.next(); 
		System.out.print("Name:  ");
		nameInput = input.next(); 
		System.out.print("Balance:  "); 
		balanceInput = input.nextInt(); 
		
		Account account2 = new Account(idInput, nameInput, balanceInput); 

		System.out.println("How much money do you want to withdraw your account?  ");
		balanceChange = input.nextInt();
		account2.debit(balanceChange);
		
		System.out.println("Your new balance is $" + account2.getBalance() + ".  ");
		
		
		/** Money transfer from account1 (this) to account2 (another).  */
		System.out.println("How much money do you want to transfer from account 1 to account 2:  ");
		balanceChange = input.nextInt(); 
		
		account1.transferTo(account2, balanceChange);
		
		System.out.println("Account 1's current balance:  $" + account1.getBalance() + ".  ");
		System.out.println("Account 2's current balance:  $" + account2.getBalance() + ".  ");
		
		input.close();
		
	}
	
}
