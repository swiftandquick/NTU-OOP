package Section1Problem7;

public class Date {

	private int day; 
	private int month; 
	private int year; 
	
	Date(int retrievedDay, int retrievedMonth, int retrievedYear) {
		day = retrievedDay; 
		month = retrievedMonth; 
		year = retrievedYear; 
	}
	
	public int getDay() {
		return day; 
	}
	
	public void setDay(int retrievedDay) {
		this.day = retrievedDay; 
	}
	
	public int getMonth() {
		return month; 
	}
	
	public void setMonth(int retrievedMonth) {
		this.month = retrievedMonth; 
	}
	
	public int getYear() {
		return year; 
	}
	
	public void setYear(int retrievedYear) {
		this.year = retrievedYear; 
	}
	
	public void setDate(int retrievedDay, int retrievedMonth, int retrievedYear) {
		this.day = retrievedDay; 
		this.month = retrievedMonth; 
		this.year = retrievedYear; 
	}
	
	public String toString() {
		return day + "/" + month + "/" + year; 
	}
	
}
