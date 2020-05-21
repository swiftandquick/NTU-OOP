package Section3Problem3;

import java.math.BigInteger; // A built in class.  

public class BigIntegerDemo {

	public static void main(String args[]) {
		
		/** The range of int is -2,147,483,648 to 2,147,483,647, BigInteger object allows storage of higher integers.  */
		
		/** Creates an object that stores large integers.  */
		BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111");
		BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222222222222222");
		
		System.out.println(i1.toString()); 
		System.out.println(i2.toString()); 

		/** Add i2 to i1.  */
		System.out.println(i1.add(i2));
		
		/** The BigInteger class has many, many more functions.  I can look at up on docs.oracle.com.   */
		
	}
	
}