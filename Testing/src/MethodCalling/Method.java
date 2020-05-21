package MethodCalling;

public class Method {

	float x, y, z; 
	
	Method () {
		x = 0;
		y = 0; 
		z = 0; 
	}
	
	Method (int rX, int rY, int rZ) {
		x = rX; 
		y = rY; 
		z = rZ; 
	}
	
	public void setXYZ(int rX, int rY, int rZ) {
		this.x = rX; 
		this.y = rY; 
		this.z = rZ; 
	}
	
	/** Player 1's goal.  */
	public boolean p1Goal() {
		if (x >= 30 && x <= 50 && y >= 0 && y <= 10 && z <= 3) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	/** Player 2's goal.  */
	public boolean p2Goal() {
		if (x >= 30 && x <= 50 && y >= 110 && y <= 120 && z <= 3) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
}
