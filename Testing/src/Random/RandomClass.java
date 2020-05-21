package Random;

public class RandomClass {

	public static void main(String args[]) {
		
		/** Get number from 0, 1, 2, 3, 4.  */
		int random = (int)(Math.random() * 5); 
		System.out.println(random);
		
		/** Get number from 10 to 19.  */
		int random2 = (int)(Math.random() * 10 + 10);
		System.out.println(random2);
		
		/** Get number from 110, 120, 130 ... 200.  */
		int random3 = (int)(Math.random() * 10 + 11) * 10;
		System.out.println(random3);
		
	}
	
}
