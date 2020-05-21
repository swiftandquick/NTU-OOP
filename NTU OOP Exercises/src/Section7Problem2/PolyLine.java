package Section7Problem2;

import java.util.*; // Includes List and ArrayList.  

/** The polyline class composes of n points.  n as in more than 1.  */
public class PolyLine {

	/** Instance variable is an array list contains multiple Point objects.  */
	private List<Point> points;
	
	/** Default constructor initializes an empty array list.  */
	PolyLine() {
		points = new ArrayList<Point>();
	}
	
	PolyLine(List<Point> rPoints) {
		points = rPoints; 
	}
	
	/** Adds a new Point object to the array list.  */
	public void appendPoint(int rX, int rY) {
		points.add(new Point(rX, rY));
	}
	
	public void appendPoint(Point rPoint) {
		points.add(rPoint); 
	}
	
	/** Returns a string that contains all points.  */
	public String toString() {
		String fullString = "{";
		for (Point point : points) {
			fullString = fullString + point.toString();
		}
		fullString = fullString + "}";
		return fullString;
	}
	
	/**
	 * Arraylist's size is can be find by arraylist_name.size(). I can find the
	 * total length by adding the distance between each 2 connected points together.
	 */
	public double getLength() {
		double totalLength = 0;
		for (int i = 0; i < (points.size() - 1); i++) {
			totalLength = totalLength + points.get(i).distance(points.get(i + 1));
		}
		return totalLength; 
	}
	
}
