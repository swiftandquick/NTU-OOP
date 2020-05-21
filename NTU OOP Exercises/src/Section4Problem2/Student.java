package Section4Problem2;

public class Student extends Person {

	private String program;
	private int year; 
	private double fee; 
	
	/**
	 * super (// superclass instance variables) can invoke the superclass
	 * constructor. It must be the first line inside the subclass constructor.
	 */
	Student(String rName, String rAddress, String rProgram, int rYear, double rFee) {
		super(rName, rAddress);
		program = rProgram; 
		year = rYear;
		fee = rFee; 
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String rProgram) {
		this.program = rProgram; 
	}
	
	public int getYear() {
		return year; 
	}
	
	public void setYear(int rYear) {
		this.year = rYear; 
	}
	
	public double getFee() {
		return fee; 
	}
	
	public void setFee(double rFee) {
		this.fee = rFee; 
	}
	
	public String toString() {
		return "Student[" + super.toString() + ", program = " + program
				+ ", year = " + year + ", fee = $" + fee + "]";
	}
	
}
