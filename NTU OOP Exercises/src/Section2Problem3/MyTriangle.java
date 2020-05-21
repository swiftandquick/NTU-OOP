package Section2Problem3;

public class MyTriangle {
	
	private MyPoint v1; 
	private MyPoint v2; 
	private MyPoint v3; 
	
	MyTriangle(int rX1, int rY1, int rX2, int rY2, int rX3, int rY3) {
		v1 = new MyPoint(rX1, rY1); 
		v2 = new MyPoint(rX2, rY2); 
		v3 = new MyPoint(rX3, rY3); 
	}
	
	MyTriangle(MyPoint rV1, MyPoint rV2, MyPoint rV3) {
		v1 = rV1; 
		v2 = rV2; 
		v3 = rV3; 
	}
	
	public String toString() {
		return "Triangle + [v1 = (" + v1.getX() + ", " + v1.getY() + 
				"), v2 = (" + v2.getX() + ", " + v2.getY() + "), v3 = (" 
				+ v3.getX() + ", " + v3.getY() + ")]";
	}
	
	/** Get perimeter by calculating the distance of the three sides, each side's distance is the distance between 2 coordinates.  */
	public double getPerimeter() {
		double side1 = Math.sqrt(Math.pow((v1.getX() - v2.getX()), 2) + Math.pow((v1.getY() - v2.getY()), 2));
		double side2 = Math.sqrt(Math.pow((v1.getX() - v3.getX()), 2) + Math.pow((v1.getY() - v3.getY()), 2));
		double side3 = Math.sqrt(Math.pow((v2.getX() - v3.getX()), 2) + Math.pow((v2.getY() - v3.getY()), 2));
		return side1 + side2 + side3;
	}
	
	/** Return what triangle type it is by checking the comparing the sides.  */
	public String getType() {
		double side1 = Math.sqrt(Math.pow((v1.getX() - v2.getX()), 2) + Math.pow((v1.getY() - v2.getY()), 2));
		double side2 = Math.sqrt(Math.pow((v1.getX() - v3.getX()), 2) + Math.pow((v1.getY() - v3.getY()), 2));
		double side3 = Math.sqrt(Math.pow((v2.getX() - v3.getX()), 2) + Math.pow((v2.getY() - v3.getY()), 2));
		if (side1 == side2 && side1 == side3 && side2 == side3) {
			return "Equilateral Triangle"; // All equal sides.  
		}
		else if (side1 == side2 || side1 == side3 || side2 == side3) {
			return "Isosceles Triangle"; // Two equal sides.  
		}
		else {
			return "Scalene Triangle"; // No equal sides.  
		}
	}
	
}
