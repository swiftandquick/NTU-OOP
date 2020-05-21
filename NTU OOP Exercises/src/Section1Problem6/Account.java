package Section1Problem6;

public class Account {

	private String id;
	private String name;
	private int balance; 
	
	Account(String retrievedId, String retrievedName) {
		id = retrievedId; 
		name = retrievedName; 
	}
	
	Account(String retrievedId, String retrievedName, int retrievedBalance) {
		id = retrievedId; 
		name = retrievedName; 
		balance = retrievedBalance; 
	}
	
	public String getId() {
		return id; 
	}
	
	public String getName() {
		return name; 
	}
	
	public int getBalance() {
		return balance; 
	}
	
	public int credit(int amount) {
		this.balance = balance + amount;
		return balance; 
	}
	
	public int debit(int amount) {
		if(amount <= balance) {
			this.balance = balance - amount;
			return balance; 
		}
		else {
			System.out.println("Amount exceeded.  Action denied.  ");
			return balance;
		}
	}
	
	/** Subtract from this account's balance and give money to another account.  */
	public int transferTo(Account another, int amount) {
		if (amount <= balance) {
			this.balance = this.balance - amount;
			another.balance = another.balance + amount;
			return balance;
		}
		else {
			System.out.println("Amount exceeded.  Action denied.  ");
			return balance;
		}
	}
	
}
