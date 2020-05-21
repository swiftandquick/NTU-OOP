package Section3Problem1;

import java.util.Scanner;

public class MyComplexDemo {

	public static void main(String args[]) {
		
		double iReal, iImag; 
		
		Scanner input = new Scanner(System.in);
		
		/** Use constructor to set up the first complex number.  */
		System.out.println("Complex #1:  "); 
		System.out.print("Real Part:  "); 
		iReal = input.nextDouble(); 
		System.out.print("Imaginary Part:  "); 
		iImag = input.nextDouble(); 
		
		MyComplex complex1 = new MyComplex(iReal, iImag); 
		System.out.println("The complex number is currently " + "(" + complex1.getReal() + " + " + complex1.getImag() + "i).  "); 
		System.out.println("The complex number's magnitude is " + complex1.magnitude() + ".  "); 
		System.out.println("The complex number's argument is:  " + complex1.argument() + ".  "); 
		
		/** Gets the conjugated value of complex1.  Then conjugate the complex number to return to its original value.  */
		complex1.conjugate();  
		System.out.println("The complex number is currently is " + complex1.toString() + ".  "); 
		complex1.conjugate();  
		System.out.println("The complex number is currently is " + complex1.toString() + ".  "); 

		/** Check if the complex number is pure real or pure imaginary.  */
		System.out.println("The number is a pure real number:  " + complex1.isReal() + ".  "); 
		System.out.println("The number is a pure imaginary number:  " + complex1.isImag() + ".  "); 
		
		/** Set up an object with no arguments pass to the constructor, then use setter to set up the second complex number.  */
		MyComplex complex2 = new MyComplex(); 	
		
		System.out.println("\nComplex #2:  "); 
		System.out.print("Real Part:  "); 
		iReal = input.nextDouble(); 
		System.out.print("Imaginary Part:  "); 
		iImag = input.nextDouble(); 
		
		complex2.setReal(iReal);
		complex2.setImag(iImag);
		
		/** Compare complex2 to a newly inserted imaginary number.  */
		System.out.println("Enter the information of the compared complex number:  "); 
		System.out.print("Real Part:  "); 
		iReal = input.nextDouble(); 
		System.out.print("Imaginary Part:  "); 
		iImag = input.nextDouble(); 
		
		System.out.println(complex2.toString() + "and (" + iReal + ", " + iImag + ") are equal:  " + complex2.equals(iReal, iImag) + ".  ");
		
		/** Add complex1's value onto complex2, then subtract the value back.  */
		System.out.println("Complex #1:  " + complex1.toString()); 
		System.out.println("Complex #2:  " + complex2.toString()); 
		System.out.println("Add " + complex1.toString() + " to " + complex2.toString() + ".  ");
		complex1.addNew(complex2); 
		System.out.println("Complex #1:  " + complex1.toString()); 
		System.out.println("Complex #2:  " + complex2.toString()); 
		System.out.println("Subtract " + complex1.toString() + " from " + complex2.toString() + ".  ");
		complex1.subtractNew(complex2); 
		System.out.println("Complex #1:  " + complex1.toString()); 
		System.out.println("Complex #2:  " + complex2.toString()); 
		
		/** Create the third complex number.  */
		System.out.println("\nComplex #3:  "); 
		System.out.print("Real Part:  "); 
		iReal = input.nextDouble(); 
		System.out.print("Imaginary Part:  "); 
		iImag = input.nextDouble(); 
		
		MyComplex complex3 = new MyComplex(iReal, iImag); 
		System.out.println("The complex number is currently " + complex3.toString() + ".  "); 
		
		/** Use complex3 to add, subtract, multiply, and divide complex1 or complex2.  complex3's value changes each time an operation ends.  */
		System.out.println(complex3.toString() + " + " + complex1.toString() + " = " + complex3.add(complex1)); 
		System.out.println(complex3.toString() + " - " + complex1.toString() + " = " + complex3.subtract(complex1)); 
		System.out.println(complex3.toString() + " * " + complex2.toString() + " = " + complex3.multiply(complex2)); 
		System.out.println(complex3.toString() + " / " + complex2.toString() + " = " + complex3.divide(complex2)); 
		
		input.close();
		
	}
	
}
