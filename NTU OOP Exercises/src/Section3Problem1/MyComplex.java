package Section3Problem1;

/** This program is about complex numbers, complex numbers are a mix of real and imaginary numbers.  */
public class MyComplex {

	private double real; // Real number.  
	private double imag; // Imaginary number, in this case, I will only use radian (i).  
	
	MyComplex() {
		real = 0; 
		imag = 0; 
	}
	
	MyComplex(double rReal, double rImag) {
		real = rReal; 
		imag = rImag; 
	}
	
	public double getReal() {
		return real; 
	}
	
	public void setReal(double rReal) {
		this.real = rReal; 
	}
	
	public double getImag() {
		return imag; 
	}
	
	public void setImag(double rImag) {
		this.imag = rImag; 
	}
	
	public void setValue(double rReal, double rImag) {
		this.real = rReal; 
		this.imag = rImag; 
	}
	
	public String toString() {
		return "(" + real + " + " + imag + "i)";
	}
	
	/** If the complex number has no imaginary part, then it's a pure real number.  */
	public boolean isReal() {
		return (imag == 0);
	}

	/** If the complex number has no real part, then it's a pure imaginary number.  */
	public boolean isImag() {
		return (real == 0);
	}
	
	/** Check if the input complex number is the same as the current complex number.  */
	public boolean equals(double otherReal, double otherImag) {
		return ((this.real == otherReal) && (this.imag == otherImag)); 
	}
	
	/** Check if the current complex number (this) is equivalent to the compared complex number (another).  */
	public boolean equals(MyComplex another) {
		return this == another;
	}
	
	/** Find the magnitude of the complex number.  */
	public double magnitude() {
		return Math.sqrt(real * real + imag * imag); 
	}
	
	public double argument() {
		return Math.atan2(imag, real); // In radians.  
	}
	
	/** this = this + right.  Returns this.  Current object's value changes.  */
	public MyComplex add(MyComplex right) {
		this.real = this.real + right.real; 
		this.imag = this.imag + right.imag; 
		return this;
	}
	
	/** right = this + right.  Returns right.  New object's value changes.  */
	public MyComplex addNew(MyComplex right) {
		right.real = right.real + this.real; 
		right.imag = right.imag + this.imag; 
		return right; 
	}
	
	/** this = this - right.  Returns right.  Current object's value changes.  */
	public MyComplex subtract(MyComplex right) {
		this.real = this.real - right.real; 
		this.imag = this.imag - right.imag; 
		return this; 
	}
	
	/** right = this - right.  Returns right.  New object's value changes.  */
	public MyComplex subtractNew(MyComplex right) {
		right.real = right.real - this.real; 
		right.imag = right.imag - this.imag; 
		return right; 
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
	
	/** a + bi became a - bi, in my case, a + bi became a + (-b)i*/
	public MyComplex conjugate() {
		this.imag = -this.imag;
		return this; 
	}
	
}