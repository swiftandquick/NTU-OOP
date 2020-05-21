package Section2Problem3;

public class MyRectangle {

	private MyPoint topLeft;
	private MyPoint bottomRight; 
	
	MyRectangle(int rX1, int rY1, int rX2, int rY2) {
		topLeft = new MyPoint(rX1, rY1);
		bottomRight = new MyPoint(rX2, rY2); 
	}
	
	MyRectangle(MyPoint rTopLeft, MyPoint rBottomRight) {
		topLeft = rTopLeft;
		bottomRight = rBottomRight; 
	}
	
	public String toString() {
		return "Rectangle[p1 = (" + topLeft.getX() + ", " + topLeft.getY() + "), p2 = (" + 
				bottomRight.getX() + ", " + topLeft.getY() + "), p3 = (" + topLeft.getX() + ", " + 
				bottomRight.getY() + "), p4 = (" + bottomRight.getX() + ", " + bottomRight.getY() + ")]";
	}
	
	public int getArea() {
		return Math.abs((bottomRight.getX() - topLeft.getX()) * (topLeft.getY() - bottomRight.getY())); 
	}
	
	public int getPerimeter() {
		return Math.abs((bottomRight.getX() - topLeft.getX()) * 2) + Math.abs((topLeft.getY() - bottomRight.getY()) * 2);
	}
	
}
