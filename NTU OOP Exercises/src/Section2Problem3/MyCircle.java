package Section2Problem3;

public class MyCircle {

	private MyPoint center; 
	private int radius;
	
	MyCircle() {
		center = new MyPoint(); // Default coordinate is (0, 0).  
		radius = 1; 
	}
	
	MyCircle(int retrievedX, int retrievedY, int retrievedRadius) {
		center = new MyPoint(retrievedX, retrievedY); 
		radius = retrievedRadius; 
	}
	
	MyCircle(MyPoint retrievedCenter, int retrievedRadius) {
		center = retrievedCenter; 
		radius = retrievedRadius; 
	} 
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int retrievedRadius) {
		this.radius = retrievedRadius; 
	}
	
	public MyPoint getCenter() {
		return center; 
	}
	
	public void setCenter(MyPoint retrievedCenter) {
		this.center = retrievedCenter; 
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public void setCenterX(int retrievedX) {
		center.setX(retrievedX); 
	}
	
	public int getCenterY() {
		return center.getY(); 
	}
	
	public void setCenterY(int retrievedY) {
		center.setY(retrievedY); 
	}
	
	public int[] getCenterXY() {
		return center.getXY();
	}
	
	public void setCenterXY(int retrievedX, int retrievedY) {
		center.setXY(retrievedX, retrievedY);
	}
	
	public double getArea() {
		return radius * radius * Math.PI; 
	}
	
	public double getCircumference() {
		return radius * 2 * Math.PI;
	}
	
	/** I am not sure if this works.  */
	public double distance(MyCircle another) {
		return Math.sqrt(Math.pow((this.center.getX() - another.center.getX()), 2) + Math.pow((this.center.getY() - another.center.getY()), 2));
	}
	
}
