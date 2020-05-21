package ArrayOfObjects;

import java.util.Scanner;

public class Show {

	private String title;
	private Comedian[] comedians;
	
	Show(String retrievedTitle, Comedian[] retrievedComedians) {
		title = retrievedTitle;
		comedians = retrievedComedians; 
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String retrievedTitle) {
		this.title = retrievedTitle;
	}
	
	public Comedian[] getComedians() {
		return comedians;
	}
	
	public void setComedians(Comedian[] retrievedComedians) {
		this.comedians = retrievedComedians; 
	}

	
	/** Begin main class.  */
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		String nameInput, titleInput;
		String comedianList = " - ";
		int number;
		
		System.out.println("How many comedians are there?  ");
		number = input.nextInt();
		
		Comedian[] comediansInput = new Comedian[number];
		
		for(int i = 0; i <= number - 1; i++) {
			System.out.print("Comedian:  ");
			nameInput = input.next();
			comediansInput[i] = new Comedian(nameInput);
			// comediansInput[i].setName(nameInput);
			comedianList = comedianList + comediansInput[i].getName() + " - ";
		}
		comedianList = "Comedians[" + comedianList + "]";
		System.out.println(comedianList);
		
		System.out.print("Show:  ");
		input.nextLine();
		titleInput = input.nextLine();
		
		Show newShow = new Show(titleInput, comediansInput);
		System.out.println("Show[ Title = " + newShow.getTitle() + ", " + comedianList + " ]");
		
		input.close();
		
	}
	
}