package Section1Problem8;

public class Time {

	private int hour, minute, second;

	Time(int retrievedHour, int retrievedMinute, int retrievedSecond) {
		if (retrievedHour > 23 || retrievedHour < 1) {
			hour = 0;
		}
		else {
			hour = retrievedHour; 
		}
		if (retrievedMinute > 59 || retrievedMinute < 1) {
			minute = 0; 
		}
		else {
			minute = retrievedMinute; 
		}
		if (retrievedSecond > 59 || retrievedSecond < 1) {
			second = 0; 
		}
		else {
			second = retrievedSecond; 
		}
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
	
	public void setHour(int retrievedHour) {
		if (retrievedHour > 23 || retrievedHour < 1) {
			this.hour = 0;
		}
		else {
			this.hour = retrievedHour; 
		}
	}

	public void setMinute(int retrievedMinute) {
		if (retrievedMinute > 59 || retrievedMinute < 1) {
			this.minute = 0;
		}
		else {
			this.minute = retrievedMinute; 
		}
	}

	public void setSecond(int retrievedSecond) {
		if (retrievedSecond > 59 || retrievedSecond < 1) {
			this.second = 0;
		}
		else {
			this.second = retrievedSecond; 
		}
	}
	
	public void setTime(int retrievedHour, int retrievedMinute, int retrievedSecond) {
		if (retrievedHour > 23 || retrievedHour < 1) {
			this.hour = 0;
		}
		else {
			this.hour = retrievedHour; 
		}
		if (retrievedMinute > 59 || retrievedMinute < 1) {
			this.minute = 0; 
		}
		else {
			this.minute = retrievedMinute; 
		}
		if (retrievedSecond > 59 || retrievedSecond < 1) {
			this.second = 0; 
		}
		else {
			this.second = retrievedSecond; 
		}
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	public Time nextSecond(Time addOne) {
		addOne.second = addOne.second + 1;
		if (addOne.second == 60) {
			addOne.second = 0;
			addOne.minute = addOne.minute + 1;
			if (addOne.minute == 60) {
				addOne.minute = 0;
				addOne.hour = addOne.hour + 1; 
				if (addOne.hour == 24) {
					addOne.hour = 0;
				}
			}
		}
		return addOne;
	}
	
	public Time previousSecond(Time subtractOne) {
		subtractOne.second = subtractOne.second - 1;
		if (subtractOne.second == -1) {
			subtractOne.second = 59;
			subtractOne.minute = subtractOne.minute - 1;
			if (subtractOne.minute == -1) {
				subtractOne.minute = 59;
				subtractOne.hour = subtractOne.hour - 1; 
				if (subtractOne.hour == -1) {
					subtractOne.hour = 23;
				}
			}
		}
		return subtractOne;
	}
	
}