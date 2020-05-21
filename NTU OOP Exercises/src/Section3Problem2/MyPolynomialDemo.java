package Section3Problem2;

/** No scanner, it's slowing down.  */
public class MyPolynomialDemo {

	public static void main(String args[]) {
		
		double[] poly1 = {4, 6, 0, 8, 4}; // 4x^4 + 8x^3 + 6x + 4
		double[] poly2 = {-3, 6, 2, 3}; // 3x^3 + 2x^2 + 6x - 3
		double[] poly3 = {0, 5, -7, 0, 2, 4}; // 4x^5 + 2x^4 - 7x^2 + 5x
		double[] poly4 = {-1, 2, 1, 5}; // 5x^3 + x^2 + 2x - 1
		double[] poly5 = {6, -3, 2, 0, 4, 7}; // 7x^5 + 4x^4 + 2x^2 - 3x + 6
		
		/** 
		 * Empty array, gives it 20 indices, will be used later.  
		 * Set the array length equivalent to the size of poly2 or poly3, depending on which one is bigger.  
		 */
		double[] sum = new double[(poly2.length > poly3.length) ? poly2.length : poly3.length]; 
		
		/** 
		 * Empty array, gives it 20 indices, will be used later.  
		 * Set the array length equivalent to the largest possible degree of power after the polynomial multiplication.  
		 */
		double[] product = new double[(poly4.length - 1) + (poly5.length - 1) + 1]; 
		
		/** Create objects by passing in the array variables.  */
		MyPolynomial polynomial1 = new MyPolynomial(poly1); 
		MyPolynomial polynomial2 = new MyPolynomial(poly2); 
		MyPolynomial polynomial3 = new MyPolynomial(poly3); 
		MyPolynomial polynomial4 = new MyPolynomial(poly4); 
		MyPolynomial polynomial5 = new MyPolynomial(poly5); 
		MyPolynomial polynomialSum = new MyPolynomial(sum); 
		MyPolynomial polynomialProduct = new MyPolynomial(product); 
		
		/** Evaluate polynomial1.  */
		System.out.println("Polynomial:  " + polynomial1.toString());
		System.out.println("x = 2.35");
		System.out.println("The result is " + polynomial1.evaluate(2.35) + ".  ");
		
		/** Calculate the sum of polynomial2 and polynomial3.  */
		System.out.println("Sum of " + polynomial2.toString() + " and " + polynomial3.toString() + ":  "); 
		System.out.println(polynomialSum.add(polynomial2, polynomial3)); 
		
		/** Calculate the product of polynomial4 and polynomial5.  */
		System.out.println("Product of " + polynomial4.toString() + " and " + polynomial5.toString() + ":  ");
		System.out.println(polynomialProduct.multiply(polynomial4, polynomial5)); 
		
	}
	
}
