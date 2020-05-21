package Section4Problem3;

public class Point2D {

	private float x, y; 
	
	Point2D() {
		x = 0; 
		y = 0; 
	}
	
	Point2D(float rX, float rY) {
		x = rX; 
		y = rY; 
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
	
	public float[] getXY() {
		float xy[] = {x, y};
		return xy;
	}
	
	public void setXY(float rX, float rY) {
		this.x = rX; 
		this.y = rY; 
	}
	
}
