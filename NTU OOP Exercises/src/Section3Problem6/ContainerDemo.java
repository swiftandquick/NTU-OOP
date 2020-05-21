package Section3Problem6;

public class ContainerDemo {

	public static void main(String args[]) {

		/**
		 * Test method copied from the website, looks about right, not sure if other
		 * inputs will also be the same. Simply put, the ball will start inside the
		 * container, but if it moves outside of the container, the movement will
		 * reverse until it's back in the container again.
		 */
		Ball ball = new Ball(50, 50, 5, 10, 30);
		Container box = new Container(0, 0, 100, 100);
		for (int step = 0; step < 100; ++step) {
			ball.move();
			box.collides(ball);
			System.out.println(ball.toString());
		}
		
	}
	
}
