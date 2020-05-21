package Section3Problem6;

/** Container class checks if the container contains the ball.  */
public class Container {

	/** Top left = (x1, y1), bottom right = (x2, y2).  */
	private int x1, y1, x2, y2; 
	
	/** Set up a constructor, (rX, rY) = (x1, y2) as the top left coordinate.  */
	Container(int rX, int rY, int rWidth, int rHeight) {
		x1 = rX; 
		y1 = rY; 
		x2 = rX + rWidth; 
		y2 = rY - rHeight; 
	}
	
	/** Getters. */
	public int getX() {
		return x1; 
	}
	
	public int getY() {
		return y1; 
	}
	
	public int getWidth() {
		return Math.abs(x2 - x1); 
	}
	
	public int getHeight() {
		return Math.abs(y1 - y2); 
	}
	
	/** Basically, checks if the circle (ball) and the rectangle (container) will overlap or not.  If the ball is outside of the container box, 
	 * then, the ball will change the movement direction (via reflection) and returns true.  */
	public boolean collides(Ball rBall) {
		if (rBall.getX() - rBall.getRadius() <= this.x1 || 
			rBall.getX() - rBall.getRadius() >= this.x2) {
			rBall.reflectHorizontal();
			return true; 			
		}
		else if (rBall.getY() - rBall.getRadius() <= this.y2 || 
				rBall.getY() - rBall.getRadius() >= this.y1) {
			rBall.reflectVertical();
			return true;
		}
		else {
			return false; 
		}
	}
	
}
