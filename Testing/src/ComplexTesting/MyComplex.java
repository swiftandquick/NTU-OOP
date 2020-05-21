package ComplexTesting;

public class MyComplex {

	private double real;
	private double imag; 
	
	MyComplex(double rReal, double rImag) {
		real = rReal; 
		imag = rImag; 
	}
	
	/** Returns this.  Current object's value changes.  */
	public MyComplex multiply(MyComplex right) {
		double newReal = this.real * right.real - this.imag * right.imag; 
		double newImag = this.real * right.imag + this.imag * right.real; 
		this.real = newReal;
		this.imag = newImag; 
		return this; 
	}
	
	/** Returns this.  Current object's value changes.  */
	public MyComplex divide(MyComplex right) {
		double newReal = (this.real * right.real + this.imag * right.imag) / (right.real * right.real + right.imag * right.imag); 
		double newImag = (this.imag * right.real - this.real * right.imag) / (right.real * right.real + right.imag * right.imag); 
		this.real = newReal; 
		this.imag = newImag; 
		return this; 
	}
	
	public String toString() {
		return "(" + real + " + " + imag + "i)";
	}
	
}
