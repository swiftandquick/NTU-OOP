package Section1Problem9;

public class Ball {

	private float x;
	private float y;
	private int radius; 
	private float xDelta;
	private float yDelta; 
	
	Ball(float retrievedX, float retrievedY, int retrievedRadius, int retrievedSpeed, int retrievedDirection) {
		x = retrievedX;
		y = retrievedY;
		radius = retrievedRadius; 
		xDelta = (float) (retrievedSpeed * Math.cos(Math.toRadians(retrievedDirection))); 
		yDelta = (float) (-retrievedSpeed * Math.sin(Math.toRadians(retrievedDirection))); 
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(int retrievedX) {
		this.x = retrievedX;
	}
	
	public float getY() {
		return y; 
	}
	
	public void setY(int retrievedY) {
		this.y = retrievedY; 
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int retrievedRadius) {
		this.radius = retrievedRadius;
	}
	
	public float getXDelta() {
		return xDelta;
	}
	
	public void setXDelta(float retrievedXDelta) {
		this.xDelta = retrievedXDelta;
	}
	
	public float getYDelta() {
		return yDelta;
	}
	
	public void setYDelta(float retrievedYDelta) {
		this.yDelta = retrievedYDelta;
	}
	
	public void move() {
		this.x = this.x + this.xDelta; 
		this.y = this.y + this.yDelta; 
	}
	
	public void reflectHorizontal() {
		this.xDelta = -this.xDelta;
	}
	
	public void reflectVertical() {
		this.yDelta = -this.yDelta; 
	}
	
	public String toString() {
		return "Ball[(" + x + ", " + y + "), radius = " + this.getRadius() + ", " + "speed = (" + xDelta + ", " + yDelta + ")]";
	}
	
}
