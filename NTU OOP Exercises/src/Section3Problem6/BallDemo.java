package Section3Problem6;

import java.util.Scanner;

public class BallDemo {

	public static void main(String args[]) {
		
		float xInput, yInput, xDeltaInput, yDeltaInput;
		int radiusInput, speedInput, directionInput;
		
		Scanner input = new Scanner(System.in);
		
		/** First ball.  */
		System.out.print("x:  "); 
		xInput = input.nextFloat(); 
		System.out.print("y:  "); 
		yInput = input.nextFloat(); 
		System.out.print("Radius:  "); 
		radiusInput = input.nextInt(); 
		System.out.print("Horizontal Movement:  ");
		xDeltaInput = input.nextFloat();
		System.out.print("Vertical Movement:  ");
		yDeltaInput = input.nextFloat(); 
		
		/** Intentionally leave direction and speed to 0 and set xDelta and yDelta later.  */
		Ball newBall = new Ball(xInput, yInput, radiusInput, 0, 0); 
		
		/** Passes in the movement directions as arguments.  */
		newBall.setXDelta(xDeltaInput); 
		newBall.setYDelta(yDeltaInput); 
		newBall.move(); 
		System.out.println(newBall.toString());
		
		/** Horizontal reflection.  */
		newBall.reflectHorizontal();
		newBall.move(); 
		System.out.println(newBall.toString());

		/** Vertical reflection.  */
		newBall.reflectVertical();
		newBall.move(); 
		System.out.println(newBall.toString()); 
		
		/** Second ball.  */
		System.out.print("x:  "); 
		xInput = input.nextFloat(); 
		System.out.print("y:  "); 
		yInput = input.nextFloat(); 
		System.out.print("Radius:  "); 
		radiusInput = input.nextInt(); 
		System.out.print("Speed:  ");
		speedInput = input.nextInt();
		System.out.print("Direction (in Degrees):  ");
		directionInput = input.nextInt(); 
		
		/** Passes in every single possible argument.  */
		Ball anotherBall = new Ball(xInput, yInput, radiusInput, speedInput, directionInput); 
		System.out.println(anotherBall.toString());
		
		/** Horizontal reflection.  */
		anotherBall.reflectHorizontal();
		anotherBall.move(); 
		System.out.println(anotherBall.toString());

		/** Vertical reflection.  */
		anotherBall.reflectVertical();
		anotherBall.move(); 
		System.out.println(anotherBall.toString()); 
		
		input.close(); 
		
	}
	
}