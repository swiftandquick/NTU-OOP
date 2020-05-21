package Section6Problem3;

public class PackageDemo {

	public static void main(String args[]) {
		
		MovablePoint point = new MovablePoint(10, 10, 1, 1); 
		System.out.println(point); 
		point.moveUp();
		System.out.println(point); 
		point.moveDown(); 
		System.out.println(point); 
		point.moveLeft(); 
		System.out.println(point); 
		point.moveRight(); 
		System.out.println(point); 

		MovableCircle circle = new MovableCircle(20, 20, 5, 5, 10); 
		System.out.println(circle); 
		circle.moveUp();
		System.out.println(circle); 
		circle.moveDown(); 
		System.out.println(circle); 
		circle.moveLeft(); 
		System.out.println(circle); 
		circle.moveRight(); 
		System.out.println(circle); 
		
		MovableRectangle rectangle = new MovableRectangle(20, 10, 10, 30, 5, 5); 
		System.out.println(rectangle); 
		rectangle.moveUp();
		System.out.println(rectangle); 
		rectangle.moveDown(); 
		System.out.println(rectangle); 
		rectangle.moveLeft(); 
		System.out.println(rectangle); 
		rectangle.moveRight(); 
		System.out.println(rectangle); 
		
	}
	
}
