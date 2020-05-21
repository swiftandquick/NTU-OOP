package ComplexTesting;

public class ComplexTesting {

	public static void main(String args[]) {
		
		MyComplex complex1 = new MyComplex(6.0, 5.0);
		MyComplex complex2 = new MyComplex(4.0, 3.0);
		
		complex1.multiply(complex2);
		System.out.println(complex1.toString()); 
		complex1.divide(complex2);
		System.out.println(complex1.toString()); 
		
	}
	
}
