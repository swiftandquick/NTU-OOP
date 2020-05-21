package Section3Problem7;

import java.util.Scanner;

public class Player {

	private int number;
	private float x, y; 
	private float z = 0.0f; // While the player is on the ground, the position is 0.  
	
	Player(int rNumber, float rX, float rY) {
		this.number = rNumber; 
		this.x = rX; 
		this.y = rY; 
	}
	
	/** Change position base on displacement.  */
	public void move(float rXDisp, float rYDisp) {
		this.x = this.x + rXDisp; 
		this.y = this.y + rYDisp; 
	}
	
	/** Jumping is z coordinate displacement.  z is set to 0 if final result is negative.  */
	public void jump(float rZDisp) {
		if (this.z + rZDisp < 0) {
			System.out.println("Z coordinate cannot be below 0!  Resetting Z coordinate to 0...  ");  
			this.z = 0;
		}
		else {
			this.z = this.z + rZDisp; 
		}
	}
	
	public String toString() {
		return "#" + number + "(" + x + ", " + y + ", " + z + ")"; 
	}
	
	/** Find the distance between the ball and the player, it's consider close if they are 8 units apart from each other.  */
	public Boolean near(Ball rBall) {
		float distance = (float) Math.sqrt(Math.pow((x - rBall.getX()), 2) + Math.pow((y - rBall.getY()), 2) + Math.pow((z - rBall.getZ()), 2));
		if (distance < 8) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	/** Changes the ball's coordinate after kicking.  */
	public void kick(Ball rBall) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("The ball is sent flying, it's new coordinate is:  "); 
		System.out.print("x:  "); 
		int newX = input.nextInt(); 
		System.out.print("y:  "); 
		int newY = input.nextInt(); 
		System.out.print("z:  "); 
		int newZ = input.nextInt(); 
		rBall.setXYZ(newX, newY, newZ);
	}
	
}
