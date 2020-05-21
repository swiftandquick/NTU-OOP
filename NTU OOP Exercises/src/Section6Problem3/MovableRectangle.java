package Section6Problem3;

/** Composes of two MovablePoint and implements Movable interface.  */
public class MovableRectangle {
	
	private MovablePoint topLeft; 
	private MovablePoint bottomRight; 
	
	MovableRectangle(int rX1, int rY1, int rX2, int rY2, int rXSpeed, int rYSpeed) {
		topLeft = new MovablePoint(rX1, rY1, rXSpeed, rYSpeed); 
		bottomRight = new MovablePoint(rX2, rY2, rXSpeed, rYSpeed); 
	}
	
	public String toString() {
		return "Rectangle[Top-Left-" + topLeft.toString() + ", Bottom-Right-" + bottomRight.toString() + "]";
	}
	
	public void moveUp() {
		topLeft.y = topLeft.y + topLeft.ySpeed; 
		bottomRight.y = bottomRight.y + bottomRight.ySpeed; 
	}
	
	public void moveDown() {
		topLeft.y = topLeft.y - topLeft.ySpeed; 
		bottomRight.y = bottomRight.y - bottomRight.ySpeed; 
	}
	
	public void moveLeft() {
		topLeft.x = topLeft.x - topLeft.xSpeed; 
		bottomRight.x = bottomRight.x - bottomRight.xSpeed; 
	}
	
	public void moveRight() {
		topLeft.x = topLeft.x + topLeft.xSpeed; 
		bottomRight.x = bottomRight.x + bottomRight.xSpeed; 
	}
	
}
