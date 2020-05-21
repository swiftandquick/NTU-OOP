package Section6Problem3;

/** Implements Movable interface.  */
public class MovablePoint implements Movable {

	/**
	 * Instance variables are not set private because it's part of the instruction,
	 * I am not sure why. "~" symbol in the UML chart means I don't have to set them
	 * private.
	 */
	int x, y, xSpeed, ySpeed; 
	
	MovablePoint(int rX, int rY, int rXSpeed, int rYSpeed) {
		x = rX; 
		y = rY; 
		xSpeed = rXSpeed; 
		ySpeed = rYSpeed; 
	}
	
	public String toString() {
		return "Point[(" + x + ", " + y + "), speed = (" + xSpeed + ", " + ySpeed + ")]";
	}
	
	public void moveUp() {
		y = y + ySpeed; 
	}
	
	public void moveDown() {
		y = y - ySpeed; 
	}
	
	public void moveLeft() {
		x = x - xSpeed; 
	}
	
	public void moveRight() {
		x = x + xSpeed; 
	}
	
}
