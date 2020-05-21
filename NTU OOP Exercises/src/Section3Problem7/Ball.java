package Section3Problem7;

public class Ball {

	float x, y, z; 
	
	/** z coordinate can't be less than 0, because 0 is on the ground.  If z < 0, z is set to 0.  */
	Ball(float rX, float rY, float rZ) {
		x = rX; 
		y = rY; 
		if (rZ < 0) {
			System.out.println("Z coordinate cannot be below 0!  Resetting Z coordinate to 0...  ");  
			z = 0; 
		}
		else {
			z = rZ; 
		}
	}
	
	public float getX() {
		return x; 
	}
	
	public float getY() {
		return y; 
	}
	
	public float getZ() {
		return z; 
	}
	
	public void setXYZ(float rX, float rY, float rZ) {
		this.x = rX; 
		this.y = rY; 
		if (rZ < 0) {
			System.out.println("Z coordinate cannot be below 0!  Resetting Z coordinate to 0...  ");  
			this.z = 0; 
		}
		else {
			this.z = rZ; 
		}
	}
	
	/** Player 1's goal.  */
	public boolean p1Goal() {
		if (x >= 30 && x <= 50 && y >= 110 && y <= 120 && z <= 3) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	/** Player 2's goal.  */
	public boolean p2Goal() {
		if (x >= 30 && x <= 50 && y >= 0 && y <= 10 && z <= 3) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	/** Check if the ball is out of bounds.  The area is 80 x 120, which represents an actual soccer field.  */
	public boolean outOfBounds() {
		if (x < 0 || x > 80 || y < 0 || y > 120) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")"; 
	}
	
	/** I usually separate the demo class with the object class, but they can be in the same class.  The main method here is only for in-class testing.  */
	public static void main(String args[]) {
		
		Ball newBall = new Ball(5, 3, 6);
		
		/** As long as I have the toString() method, I can just print(object_name) to print the object, instead of print(object_name.method_name()).  */
		System.out.println(newBall); 
		
	}
	
}
