package Section3Problem2;

public class MyPolynomial {

	private double[] coeffs; // Coefficients.  
	
	MyPolynomial(double[] retrievedCoeffs) {
		coeffs = retrievedCoeffs;
	}
	
	public int getDegree() {
		return coeffs.length; 
	}
	
	/** 
	 * For example, if the array is {1, 2, 3, 4, 5}, 
	 * then it should print 5x^4 + 4x^3 + 3x^2 + 2x + 1; 
	 * If coefficient is 0, don't print out that part.  
	 */
	public String toString() {
		String output = "";
		for (int i = (coeffs.length - 1); i >= 0; i--) {
			if (coeffs[i] != 0) {
				if (i == 0) {
					output = output + " + " + coeffs[i];
				}
				else if (i == 1) {
					output = output + " + " + coeffs[i] + "x";
				}
				else if (i == coeffs.length - 1) {
					output = output + coeffs[i] + "x^" + i;
				}
				else {
					output = output + " + " + coeffs[i] + "x^" + i; 
				}
			}
		}
		return output;
	}
	
	/** Plug in the x, and what will the polynomial result be?  */
	public double evaluate(double x) {
		double result = 0; 
		for (int i = 0; i <= (coeffs.length - 1); i++) {
			result = result + coeffs[i] * Math.pow(x, i); 
		}
		return result; 
	}
	
	/** Add the two polynomials together.  this refers to the object with sum array.  
	 * left is polynomial2 (with array poly2), right is poynomial3 (with array poly3).  */
	public MyPolynomial add(MyPolynomial left, MyPolynomial right) {
		if (left.coeffs.length >= right.coeffs.length) {
			for (int i = 0; i <= (left.coeffs.length - 1); i++) {
				if (i <= (right.coeffs.length - 1)) {
					this.coeffs[i] = left.coeffs[i] + right.coeffs[i]; 
				}
				else {
					this.coeffs[i] = left.coeffs[i];
				}
			}
		}
		else {
			for (int i = 0; i <= (right.coeffs.length - 1); i++) {
				if (i <= (left.coeffs.length - 1)) {
					this.coeffs[i] = left.coeffs[i] + right.coeffs[i]; 
				}
				else {
					this.coeffs[i] = right.coeffs[i];
				}
			}
		}
		return this; 
	}
	
	/** Multiply the two polynomials together.  this refers to the object with product array.  
	 * left is polynomial4 (with array poly4), right is poynomial5 (with array poly5).  */
	public MyPolynomial multiply(MyPolynomial left, MyPolynomial right) {
		int power;
		for (int i = (left.coeffs.length - 1); i >= 0; i--) {
			for (int j = (right.coeffs.length - 1); j >= 0; j--) {
				power = i + j; 
				System.out.println(i + "|" + j + "|" + power); 
				this.coeffs[power] = this.coeffs[power] + left.coeffs[i] * right.coeffs[j];
			}
		}
		return this; 
	}
	
}
