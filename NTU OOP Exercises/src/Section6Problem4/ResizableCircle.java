package Section6Problem4;

public class ResizableCircle extends Circle implements Resizable {

	ResizableCircle(double rRadius) {
		super(rRadius);
	}
	
	public String toString() {
		return super.toString();
	}
	
	public void resize(int rPercent) {
		radius = radius * rPercent / 100;
	}
	
}
