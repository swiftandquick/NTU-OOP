package Section3Problem6;

public class Ball {

	private float x, y, xDelta, yDelta; 
	private int radius; 
	
	Ball(float rX, float rY, int rRadius, int rSpeed, int rDirection) {
		x = rX; 
		y = rY; 
		radius = rRadius; 
		xDelta = (float) (rSpeed + Math.cos(Math.toRadians(rDirection)));
		yDelta = (float) (-rSpeed + Math.sin(Math.toRadians(rDirection)));
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float rX) {
		this.x = rX; 
	}
	
	public float getY() {
		return y; 
	}
	
	public void setY(float rY) {
		this.y = rY; 
	}
	
	public int getRadius() {
		return radius; 
	}
	
	public void setRadius(int rRadius) {
		this.radius = rRadius;  
	}
	
	public float getXDelta() {
		return xDelta; 
	}
	
	public void setXDelta(float rXDelta) {
		this.xDelta = rXDelta; 
	}
	
	public float getYDelta() {
		return yDelta; 
	}
	
	public void setYDelta(float rYDelta) {
		this.yDelta = rYDelta; 
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
