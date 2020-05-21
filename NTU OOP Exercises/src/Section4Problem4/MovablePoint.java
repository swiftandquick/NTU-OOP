package Section4Problem4;

public class MovablePoint extends Point {

	private float xSpeed; 
	private float ySpeed; 
	
	MovablePoint(float rX, float rY, float rXSpeed, float rYSpeed) {
		super(rX, rY); 
		xSpeed = rXSpeed; 
		ySpeed = rYSpeed; 
	}
	
	MovablePoint(float rXSpeed, float rYSpeed) {
		xSpeed = rXSpeed; 
		ySpeed = rYSpeed; 
	}
	
	MovablePoint() {
		xSpeed = 0; 
		ySpeed = 0; 
	}
	
	public float getXSpeed() {
		return xSpeed; 
	}
	
	public void setXSpeed(float rXSpeed) {
		xSpeed = rXSpeed; 
	}
	
	public float getYSpeed() {
		return ySpeed; 
	}
	
	public void setYSpeed(float rYSpeed) {
		ySpeed = rYSpeed; 
	}
	
	public void setSpeed(float rXSpeed, float rYSpeed) {
		this.xSpeed = rXSpeed; 
		this.ySpeed = rYSpeed; 
	}
	
	public float[] getSpeed() {
		float[] speedXY = {xSpeed, ySpeed};
		return speedXY; 
	}
	
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + "), speed = (" + xSpeed + ", " + ySpeed + ")";
	}
	
	/** Use super command to get the new x and y locations.  */
	public void move() {
		super.setXY(super.getX() + xSpeed, super.getY() + ySpeed);
	}
	
}