package Section4Problem1;

public class GeometricCalculator {

	public static void main(String args[]) {
		
		Circle redCircle = new Circle(2.5); 
		System.out.println(redCircle); 
		System.out.println("Area:  " + redCircle.getArea()); 
		
		Circle blueCircle = new Circle(3.15, "blue"); 
		System.out.println(blueCircle); 
		System.out.println("Area:  " + blueCircle.getArea()); 
		
		Circle greenCircle = new Circle();
		greenCircle.setRadius(2.75);
		greenCircle.setColor("green");
		System.out.println(greenCircle); 
		System.out.println("Area:  " + greenCircle.getArea()); 
		
		Cylinder blackCylinder = new Cylinder(2, 5, "black");
		System.out.println(blackCylinder);
		System.out.println("Volume:  " + blackCylinder.getVolume()); 
		
	}
	
}
