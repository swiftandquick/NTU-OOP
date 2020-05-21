package Section3Problem5;

public class MyDate {

	private int year, month, day; 
	/** Note that the month number is actually represented by (index - 1).  */
	String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", 
						"Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday", 
					"Thursday", "Friday", "Saturday" };
	int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
	
	/** Checks if it's leap year, if it is, change february's months to 29.  */
	public boolean isLeapYear(int rYear) {
		if (rYear % 4 == 0) {
			DAYS_IN_MONTHS[1] = 29;
			return true; 
		}
		else {
			DAYS_IN_MONTHS[1] = 28;
			return false; 
		}
	}
	
	/** Validate the year, month, and day before setting the variables for date.  */
	public boolean isValidDate(int rYear, int rMonth, int rDay) {
		if (rYear >= 1 && rYear <= 9999) {
			if (rMonth >= 1 && rMonth <= 12) {
				if (rDay >= 1  && rDay <= DAYS_IN_MONTHS[rMonth - 1]) {
					return true;
				}
				else {
					return false; 
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	/** Get the day of the week, as in Sunday, Monday, Tuesday, etc.  */
	public int getDayOfWeek(int rYear, int rMonth, int rDay) {
		int DoW, y; // Day of the week, 0 = Sunday, 6 = Saturday. 
		double m; 
		m = (rMonth - 2 + 12) % 12; 
		if (rMonth <= 2) {
			rYear--; 
		}
		y = 5 * (rYear % 4) + 4 * (rYear % 100) + 6 * (rYear % 400); 
		DoW = (day + (int)(2.6 * m - 0.2) + y) % 7; 
		return DoW; 
	}
	
	/** Default constructor, it's not a requirement, but I am using it in case.  */
	MyDate() {
		year = 1; 
		month = 1; 
		day = 1; 
	}
	
	/** The constructor and everything below should be only used after date validation.  */
	MyDate(int rYear, int rMonth, int rDay) {
		year = rYear; 
		month = rMonth; 
		day = rDay; 
	}
	
	/** The setter that sets all variables.  */
	public void setDate(int rYear, int rMonth, int rDay) {
		this.year = rYear; 
		this.month = rMonth; 
		this.day = rDay; 
	}
	
	/** Individual getters.  They are not used.  */
	public int getYear() {
		return year; 
	}
	
	public int getMonth() {
		return month; 
	}
	
	public int getDay() {
		return day; 
	}
	
	/** Individual setters.  They are not used.  */
	public void setYear(int rYear) {
		this.year = rYear;
	}
	
	public void setMonth(int rMonth) {
		this.month = rMonth; 
	}
	
	public void setDay(int rDay) {
		this.day = rDay; 
	}
	
	/** Returns a string of the current date, including the day of week, which is retrieved via getDayOfWeek method.  */
	public String toString() {
		String finalString = ""; 
		String dayString, yearString; 
		if (day <= 9) {
			dayString = "0" + day;
		}
		else {
			dayString = String.valueOf(day);
		}
		if (year <= 9) {
			yearString = "000" + year; 
		}
		else if (year <= 99) {
			yearString = "00" + year; 
		}
		else if (year <= 999) {
			yearString = "0" + year; 
		}
		else {
			yearString = String.valueOf(year); 
		}
		finalString = DAYS[getDayOfWeek(year, month, day)] + ", " + dayString + " " + MONTHS[month - 1] + ", " + yearString; 
		return finalString; 
	}
	
	/** Get the next day.  */
	public MyDate nextDay() {
		this.day = this.day + 1;
		if (this.day > DAYS_IN_MONTHS[month - 1]) {
			this.day = 1;
			this.month = this.month + 1; 
			if (this.month > 12) {
				this.month = 1; 
				this.year = this.year + 1;
				if (this.year > 9999) {
					System.out.println("Date is now out of range, exiting!  ");  
					System.exit(0);
				}
			}
		}
		return this;
	}
	
	/** Get the next month.  */
	public MyDate nextMonth() {
		this.month = this.month + 1; 
		if (this.month > 12) {
			this.month = 1; 
			this.year = this.year + 1;
			if (this.year > 9999) {
				System.out.println("Date is now out of range, exiting!  ");  
				System.exit(0);
			}
		}
		return this;
	}
	
	/** Get the next year.  */
	public MyDate nextYear() {
		this.year = this.year + 1;
		if (this.year > 9999) {
			System.out.println("Date is now out of range, exiting!  ");  
			System.exit(0);
		}
		return this;
	}
	
	/** Get the previous day.  */
	public MyDate previousDay() {
		this.day = this.day - 1;
		if (this.day < 1) {
			if (this.month == 1) {
				this.day = DAYS_IN_MONTHS[11];
				this.month = 12; 
				this.year = this.year - 1;
				if (this.year < 1) {
					System.out.println("Date is now out of range, exiting!  ");  
					System.exit(0);
				}
			}
			else {
				this.day = DAYS_IN_MONTHS[this.month - 2];
				this.month = this.month - 1;
			}
		}
		return this;
	}
	
	/** Get the previous month.  */
	public MyDate previousMonth() {
		this.month = this.month - 1; 
		if (this.month < 1) {
			this.month = 12; 
			this.year = this.year - 1;
			if (this.year < 1) {
				System.out.println("Date is now out of range, exiting!  ");  
				System.exit(0);
			}
		}
		return this;
	}
	
	/** Get the previous year.  */
	public MyDate previousYear() {
		this.year = this.year - 1;
		if (this.year < 1) {
			System.out.println("Date is now out of range, exiting!  ");  
			System.exit(0);
		}
		return this;
	}
	
}
