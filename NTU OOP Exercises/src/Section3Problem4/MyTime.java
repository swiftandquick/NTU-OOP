package Section3Problem4;

/** Same as before, but now I throw in exceptions for illegal arguments.  */

public class MyTime {

	private int hour, minute, second; 
	
	MyTime() {
		hour = 0;
		minute = 0; 
		second = 0; 
	}
	
	MyTime(int rHour, int rMinute, int rSecond) {
		if (rHour < 0 || rHour > 24 || rMinute < 0 || rMinute > 60 || rSecond < 0 || rSecond > 60) {
			throw new IllegalArgumentException("Invalid input!  ");
		}
		hour = rHour; 
		minute = rMinute; 
		second = rSecond; 
	}
	
	public void setTime(int rHour, int rMinute, int rSecond) {
		if (rHour < 0 || rHour > 24 || rMinute < 0 || rMinute > 60 || rSecond < 0 || rSecond > 60) {
			throw new IllegalArgumentException("Invalid input!  ");
		}
		this.hour = rHour; 
		this.minute = rMinute; 
		this.second = rSecond; 
	}
	
	public int getHour() {
		return hour; 
	}
	
	public int getMinute() {
		return minute; 
	}
	
	public int getSecond() {
		return second; 
	}
	
	public void setHour(int rHour) {
		if (rHour < 0 || rHour > 24) {
			throw new IllegalArgumentException("Invalid input!  ");
		}
		this.hour = rHour; 
	}
	
	public void setMinute(int rMinute) {
		if (rMinute < 0 || rMinute > 60) {
			throw new IllegalArgumentException("Invalid input!  ");
		}
		this.minute = rMinute; 
	}
	
	public void setSecond(int rSecond) {
		if (rSecond < 0 || rSecond > 60) {
			throw new IllegalArgumentException("Invalid input!  ");
		}
		this.second = rSecond; 
	}
	
	/** HH:MM:SS format.  */
	public String toString() {
		String hourString, minuteString, secondString;
		if (hour <= 9) {
			hourString = "0" + hour;
		}
		else {
			hourString = String.valueOf(hour); 
		}
		if (minute <= 9) {
			minuteString = "0" + minute;
		}
		else {
			minuteString = String.valueOf(minute); 
		}
		if (second <= 9) {
			secondString = "0" + second;
		}
		else {
			secondString = String.valueOf(second); 
		}
		return hourString + ":" + minuteString + ":" + secondString; 
	}
	
	public MyTime nextSecond() {
		this.second = this.second + 1;
		if (this.second >= 60) {
			this.second = 0; 
			this.minute = this.minute + 1;
			if (this.minute >= 60) {
				this.minute = 0;
				this.hour = this.hour + 1; 
				if (this.hour >= 24) {
					this.hour = 0; 
				}
			}
		}
		return this; 
	}
	
	public MyTime nextMinute() {
		this.minute = this.minute + 1;
		if (this.minute >= 60) {
			this.minute = 0;
			this.hour = this.hour + 1; 
			if (this.hour >= 24) {
				this.hour = 0; 
			}
		}
		return this; 
	}
	
	public MyTime nextHour() {
		this.hour = this.hour + 1; 
		if (this.hour >= 24) {
			this.hour = 0; 
		}
		return this; 
	}

	public MyTime previousSecond() {
		this.second = this.second - 1;
		if (this.second <= -1) {
			this.second = 59; 
			this.minute = this.minute - 1;
			if (this.minute <= -1) {
				this.minute = 59;
				this.hour = this.hour - 1; 
				if (this.hour <= -1) {
					this.hour = 23; 
				}
			}
		}
		return this; 
	}
	
	public MyTime previousMinute() {
		this.minute = this.minute - 1;
		if (this.minute <= -1) {
			this.minute = 59;
			this.hour = this.hour - 1; 
			if (this.hour <= -1) {
				this.hour = 23; 
			}
		}
		return this; 
	}
	
	public MyTime previousHour() {
		this.hour = this.hour - 1; 
		if (this.hour <= -1) {
			this.hour = 23; 
		}
		return this; 
	}
	
}