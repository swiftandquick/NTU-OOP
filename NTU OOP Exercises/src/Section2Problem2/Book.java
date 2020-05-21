package Section2Problem2;

import java.util.Scanner;

public class Book {

	private String name;
	private Author[] author;
	private double price; 
	private int qty; 
	
	Book(String retrievedName, Author retrievedAuthor[], double retrievedPrice) {
		name = retrievedName; 
		author = retrievedAuthor; 
		price = retrievedPrice; 
	}
	
	Book(String retrievedName, Author retrievedAuthor[], double retrievedPrice, int retrievedQty) {
		name = retrievedName; 
		author = retrievedAuthor; 
		price = retrievedPrice; 
		qty = retrievedQty; 
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthor() {
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
	
	
	/** Main class is put in the Book class.  */
	public static void main(String args[]) {
		
		String authorNameInput, emailInput, bookNameInput; 
		String authorList = "";
		char genderInput; 
		double priceInput; 
		int qtyInput; 
		int howManyAuthors;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many authors?  "); 
		howManyAuthors = input.nextInt();
		while (howManyAuthors <= 0) {
			System.out.println("Invalid input, please put a positive number.  ");
			System.out.println("How many authors?  "); 
			howManyAuthors = input.nextInt();
		}
		Author[] authors = new Author[howManyAuthors];
		
		for (int i = 0; i <= howManyAuthors - 1; i++) {
			input.nextLine();
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
			authors[i] = new Author(authorNameInput, emailInput, genderInput); 
			System.out.println(authors[i].toString() + "\n");
			
			if (i == (howManyAuthors - 1)) {
				authorList = authorList + authors[i].getName();
			}
			else {
				authorList = authorList + authors[i].getName() + ", ";
			}
		}

		input.nextLine();
		System.out.print("Book:  ");
		bookNameInput = input.nextLine();
		System.out.print("Price:  ");
		priceInput = input.nextDouble();
		System.out.print("Quantity:  ");
		qtyInput = input.nextInt(); 
		
		Book newBook = new Book(bookNameInput, authors, priceInput, qtyInput); 
		
		System.out.println("Book[" + "Name = " + newBook.getName() + ", Authors[" + authorList + 
				"], Price = $" + newBook.getPrice() + ", Quantity = " + newBook.getQty() + "]");
		
		input.close();
		
	}
	
}
