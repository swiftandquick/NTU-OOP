package Section6Problem3;

/** MovableCircle composes 1 MovablePoint.  It also implements the Movable interface.  */
public class MovableCircle {

	private int radius; 
	private MovablePoint center; 
	
	MovableCircle(int rX, int rY, int rXSpeed, int rYSpeed, int rRadius) {
		center = new MovablePoint(rX, rY, rXSpeed, rYSpeed);
		radius = rRadius; 
	}
	
	public String toString() {
		return "Circle[" + center.toString() + ", radius = " + radius + "]"; 
	}
	
	/**
	 * Since the instance variables from MovablePoint are public, I can use them
	 * here, I just need to put the object name, which is center, in front of them.
	 */
	public void moveUp() {
		center.y = center.y + center.ySpeed; 
	}
	
	public void moveDown() {
		center.y = center.y - center.ySpeed; 
	}
	
	public void moveLeft() {
		center.x = center.x - center.xSpeed; 
	}
	
	public void moveRight() {
		center.x = center.x + center.xSpeed; 
	}
	
}
