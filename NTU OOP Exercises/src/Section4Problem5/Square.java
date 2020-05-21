package Section4Problem5;

public class Square extends Rectangle {
	
	Square() {
		super(1.0, 1.0);
	}
	
	Square(double rSide) {
		super(rSide, rSide); 
	}
	
	Square(double rSide, String rColor, boolean rFilled) {
		super(rSide, rSide, rColor, rFilled); 
	}
	
	public double getSide() {
		return super.getLength();
		// return super.getWidth(); also works, as both sides are equal.  
	}
	
	public void setSide(double rSide) {
		super.setLength(rSide);
		super.setWidth(rSide);
	}
	
	public void setWidth(double rSide) {
		super.setLength(rSide);
	}

	public void setLength(double rSide) {
		super.setLength(rSide);
	}
	
	public String toString() {
		return "Square[" + super.toString() + "]"; 
	}
	
}
