package Section2Problem1;

import java.util.Scanner; 

/** The Book class' object contains the Author class' object.  */

public class Book {

	private String name;
	private Author author;
	private double price; 
	private int qty; 
	
	Book(String retrievedName, Author retrievedAuthor, double retrievedPrice) {
		name = retrievedName; 
		author = retrievedAuthor; 
		price = retrievedPrice; 
	}
	
	Book(String retrievedName, Author retrievedAuthor, double retrievedPrice, int retrievedQty) {
		name = retrievedName; 
		author = retrievedAuthor; 
		price = retrievedPrice; 
		qty = retrievedQty; 
	}
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author; 
	}
	
	public double getPrice() {
		return price; 
	}
	
	public void setPrice(double retrievedPrice) {
		this.price = retrievedPrice; 
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int retrievedQty) {
		this.qty = retrievedQty;
	}
	
	public String toString() {
		return "Book[name = " + name + ", Author[name = " + author.getName() + 
				"E-mail = " + author.getEmail() + ", Gender = " + author.getGender() 
				+ "], Price = " + price + ", Quantity = " + qty + "]";
	}
	
	/** Main class is put in the Book class.  */
	public static void main(String args[]) {
		
		String authorNameInput, emailInput, bookNameInput; 
		char genderInput; 
		double priceInput; 
		int qtyInput; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Author:  ");
		authorNameInput = input.nextLine();
		System.out.print("E-mail:  ");
		emailInput = input.next();
		System.out.print("Gender:  ");
		genderInput = input.next().charAt(0); // Character input.  
		while (!(genderInput == 'm' || genderInput == 'f' || genderInput == 'M' || genderInput == 'F')) {
			System.out.println("Try again!  ");
			System.out.print("Gender:  ");
			genderInput = input.next().charAt(0); 	
		}
		genderInput = Character.toLowerCase(genderInput); // Turn character to lower case.  
		
		/** Create a book object, pass variables to the constructor.  */
		Author newAuthor = new Author(authorNameInput, emailInput, genderInput); 
		System.out.println(newAuthor.toString() + "\n");		
		
		System.out.print("Book:  ");
		bookNameInput = input.next();
		System.out.print("Price:  ");
		priceInput = input.nextDouble();
		System.out.print("Quantity:  ");
		qtyInput = input.nextInt(); 
		
		Book newBook = new Book(bookNameInput, newAuthor, priceInput, qtyInput);
		System.out.println(newBook.toString() + "\n");		
		
		input.close();
		
	}
	
}
