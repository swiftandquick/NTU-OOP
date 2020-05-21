package Section6Problem3;

/**
 * Two set of objects with some common behaviors, so I use an interface to
 * define those behaviors. The interface has four common abstract methods.  
 * The classes that implement the Movable interface will provide actual 
 * implementation to these abstract methods.  
 */
public interface Movable {

	/** In an interface, methods don't have bodies.  */
	public void moveUp(); 
	public void moveDown(); 
	public void moveLeft(); 
	public void moveRight(); 
	
}
