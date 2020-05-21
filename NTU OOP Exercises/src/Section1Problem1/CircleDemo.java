package Section1Problem1;

import java.util.Scanner;

class CircleDemo {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		double radiusInput;
		String colorInput;

		
		/** Default radius is 1.0. Default color is red. */
		Circle newCircle = new Circle();

		System.out.println("Radius of the " + newCircle.getColor() + " circle is " + newCircle.getRadius() + ".  ");
		System.out.println("Area of the " + newCircle.getColor() + " circle is " + newCircle.getArea() + ".  ");

		
		/** Sets radius. Default color is red. */
		System.out.print("What is the radius?  ");
		radiusInput = input.nextInt();
		
		Circle newCircle2 = new Circle(radiusInput);

		System.out.println("Radius of the " + newCircle2.getColor() + " circle is " + newCircle2.getRadius() + ".  ");
		System.out.println("Area of the " + newCircle2.getColor() + " circle is " + newCircle2.getArea() + ".  ");

		
		/** Sets both radius and color. */
		System.out.print("What is the color?  ");
		colorInput = input.next();
		
		Circle newCircle3 = new Circle(radiusInput, colorInput);

		System.out.println("Radius of the " + newCircle3.getColor() + " circle is " + newCircle3.getRadius() + ".  ");
		System.out.println("Area of the " + newCircle3.getColor() + " circle is " + newCircle3.getArea() + ".  ");

		
		/** Change the radius and color of the object.  Then use setter to set new values for the object.  */
		System.out.print("What is the new radius?  ");
		radiusInput = input.nextInt();
		
		System.out.print("What is the new color?  ");
		colorInput = input.next();
		
		newCircle3.setRadius(radiusInput);
		newCircle3.setColor(colorInput);

		System.out.println("Radius of the " + newCircle3.getColor() + " circle is " + newCircle3.getRadius() + ".  ");
		System.out.println("Area of the " + newCircle3.getColor() + " circle is " + newCircle3.getArea() + ".  ");
		
		input.close();

	}

}
