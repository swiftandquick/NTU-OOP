package Section5Problem2;

public class PackageDemo {

	public static void main(String args[]) {
		
		Circle base1 = new Circle(2.5, "yellow"); 
		System.out.println(base1);
		
		Cylinder cylinder1 = new Cylinder(3.3, base1);
		System.out.println(cylinder1); 
		System.out.println("Volume:  " + cylinder1.getVolume()); 
		
		Cylinder cylinder2 = new Cylinder(2.2, 2.4, "blue");
		System.out.println(cylinder2); 
		System.out.println("Volume:  " + cylinder2.getVolume()); 
		
	}
	
}
