package Section2Problem3;

import java.util.Scanner;

public class MyTriangleDemo {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int iX1, iY1, iX2, iY2, iX3, iY3; 
		
		/** For the first triangle, I pass all coordinates through the constructor.  */
		System.out.println("Triangle 1:  ");
		System.out.print("First coordinate x:  ");
		iX1 = input.nextInt(); 
		System.out.print("First coordinate y:  ");
		iY1 = input.nextInt(); 
		System.out.print("Second coordinate x:  ");
		iX2 = input.nextInt(); 
		System.out.print("Second coordinate y:  ");
		iY2 = input.nextInt(); 
		while(iX1 == iX2 && iY1 == iY2) {
			System.out.println("Invalid input, please do it again.  ");
			System.out.print("Second coordinate x:  ");
			iX2 = input.nextInt(); 
			System.out.print("Second coordinate y:  ");
			iY2 = input.nextInt(); 
		}
		System.out.print("Third coordinate x:  "); 
		iX3 = input.nextInt(); 
		System.out.print("Third coordinate y:  "); 
		iY3 = input.nextInt(); 
		while((iX1 == iX3 && iY1 == iY3) || 
				(iX2 == iX3 && iY2 == iY3) || 
				(iX1 == iX2 && iX1 == iX3 && iX1 == iX3) || 
				(iY1 == iY2 && iY1 == iY3 && iY1 == iY3)) {
			System.out.println("Invalid input, please do it again.  ");
			System.out.print("Third coordinate x:  "); 
			iX3 = input.nextInt(); 
			System.out.print("Third coordinate y:  "); 
			iY3 = input.nextInt(); 
		}
		
		MyTriangle triangle1 = new MyTriangle(iX1, iY1, iX2, iY2, iX3, iY3); 
		System.out.println(triangle1.toString()); 
		System.out.println("Perimeter:  " + triangle1.getPerimeter()); 
		System.out.println("Triangle Type:  " + triangle1.getType()); 
		
		/** For the second triangle, I pass the coordinates to MyPoint's constructor, then pass the objects to the MyTriangle's constructor.  */
		System.out.println("\nTriangle 2:  ");
		System.out.print("First coordinate x:  ");
		iX1 = input.nextInt(); 
		System.out.print("First coordinate y:  ");
		iY1 = input.nextInt(); 
		System.out.print("Second coordinate x:  ");
		iX2 = input.nextInt(); 
		System.out.print("Second coordinate y:  ");
		iY2 = input.nextInt(); 
		while(iX1 == iX2 && iY1 == iY2) {
			System.out.println("Invalid input, please do it again.  ");
			System.out.print("Second coordinate x:  ");
			iX2 = input.nextInt(); 
			System.out.print("Second coordinate y:  ");
			iY2 = input.nextInt(); 
		}
		System.out.print("Third coordinate x:  "); 
		iX3 = input.nextInt(); 
		System.out.print("Third coordinate y:  "); 
		iY3 = input.nextInt(); 
		while((iX1 == iX3 && iY1 == iY3) || 
				(iX2 == iX3 && iY2 == iY3) || 
				(iX1 == iX2 && iX1 == iX3 && iX1 == iX3) || 
				(iY1 == iY2 && iY1 == iY3 && iY1 == iY3)) {
			System.out.println("Invalid input, please do it again.  ");
			System.out.print("Third coordinate x:  "); 
			iX3 = input.nextInt(); 
			System.out.print("Third coordinate y:  "); 
			iY3 = input.nextInt(); 
		}
		
		MyPoint t2p1 = new MyPoint(iX1, iY1); 
		MyPoint t2p2 = new MyPoint(iX2, iY2); 
		MyPoint t2p3 = new MyPoint(iX3, iY3); 
		MyTriangle triangle2 = new MyTriangle(t2p1, t2p2, t2p3); 
		System.out.println(triangle2.toString()); 
		System.out.println("Perimeter:  " + triangle2.getPerimeter()); 
		System.out.println("Triangle Type:  " + triangle2.getType()); 
		
		
		input.close();
		
	}
	
}
