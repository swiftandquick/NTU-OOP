package Section5Problem1;

/**
 * A line composes of two points. Similar to inheritance, composition is a
 * restricted form of Aggregation in which two entities are highly dependent on
 * each other.  It seems there are more codes involved in a composition.  
 */

public class Line {
	
	private Point begin; 
	private Point end; 
	
	/** Constructor that sets the two points.  */
	Line (Point rBegin, Point rEnd) {
		begin = rBegin;
		end = rEnd; 
	}
	
	/** Constructor that has the coordinate of the two points, then sets the coordinates.  */
	Line (int rBeginX, int rBeginY, int rEndX, int rEndY) {
		begin = new Point(rBeginX, rBeginY); 
		end = new Point(rEndX, rEndY); 
	}
	
	public String toString() {
		return "Line[" + "Begin-" + begin.toString() + ", End-" + end.toString() + "]"; 
	}
	
	public Point getBegin() {
		return begin; 
	}
	
	public Point getEnd() {
		return end; 
	}
	
	public void setBegin(Point rBegin) {
		this.begin = rBegin; 
	}
	
	public void setEnd(Point rEnd) {
		this.end = rEnd; 
	}
	
	public int getBeginX() {
		return begin.getX();
	}
	
	public int getBeginY() {
		return begin.getY(); 
	}
	
	public int getEndX() {
		return end.getX(); 
	}
	
	public int getEndY() {
		return end.getY(); 
	}
	
	public void setBeginX(int rX) {
		begin.setX(rX);
	}
	
	public void setBeginY(int rY) {
		begin.setY(rY);
	}
	
	public void setBeginXY(int rX, int rY) {
		begin.setXY(rX, rY);
	}
	
	public void setEndX(int rX) {
		end.setX(rX);
	}
	
	public void setEndY(int rY) {
		end.setY(rY);
	}
	
	public void setEndXY(int rX, int rY) {
		end.setXY(rX, rY);
	}
	
	/** It was originally int, I thought it would be better if it's double.  */
	public double getLength() {
		return Math.sqrt(Math.pow((end.getX() - begin.getX()), 2) + Math.pow((end.getY() - begin.getY()), 2));
	}
	
	public double getGradient() {
		return Math.atan2(Math.abs(end.getY() - begin.getY()), Math.abs((end.getX() - begin.getX())));
	}
	
}