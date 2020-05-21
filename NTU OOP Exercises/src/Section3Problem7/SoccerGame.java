package Section3Problem7;

import java.util.*; // Includes Scanner and Random, which I used.  

/**
 * For simplicity, I only have two players, one player each team. Player 1
 * initial stands on the south side, his aim is to kick the ball to the goal at
 * the north side. Player 2 initial stands on the north side, his aim is to kick
 * the ball to the goal at the south side. The field is 80 x 120 units in size,
 * unit stands for yard.
 */

public class SoccerGame {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int iX, iY, iZ, p1Number, p2Number;
		int p1Score = 0;
		int p2Score = 0;
		char quit = 'y'; // quit declare as anything but q.  

		/** The ball's initial coordinate is in the middle of the field. */
		Ball newBall = new Ball(40, 60, 0);

		/** Player 1 initially starts at 20 yards south of the ball. */
		System.out.print("Player 1's ID:  #");
		p1Number = input.nextInt();
		Player player1 = new Player(p1Number, 40, 40);

		/** Player 2 initially starts at 20 yards north of the ball. */
		System.out.print("Player 2's ID:  #");
		p2Number = input.nextInt();
		Player player2 = new Player(p2Number, 40, 80);

		do {
			System.out.println("Ball's current coordinate:  " + newBall);
			System.out.println("Player 1's current coordinate:  " + player1);
			System.out.println("Player 2's current coordinate:  " + player2);
			/** Reset the coordinate if the following happens. */
			if (newBall.p1Goal()) {
				/** If player 2 scores an own goal, it also counts as player 1's goal.  
				 * After either player scores a point, asks if the game should be continued.  */
				System.out.println("Player 1 gains a point!  ");
				p1Score = p1Score + 1; // Player 1 gets 1 point.
				newBall = new Ball(40, 60, 0);
				player1 = new Player(p1Number, 40, 40);
				player2 = new Player(p2Number, 40, 80);
				System.out.println("Do you want to stop?  Enter 'q' to quit!  ");
				quit = input.next().charAt(0);
				quit = Character.toLowerCase(quit);
			}
			
			else if (newBall.p2Goal()) {
				/** If player 1 scores an own goal, it also counts as player 2's goal.  
				 * After either player scores a point, asks if the game should be continued.  */
				System.out.println("Player 2 gains a point!  ");
				p2Score = p2Score + 1; // Player 2 gets 1 point.
				newBall = new Ball(40, 60, 0);
				player1 = new Player(p1Number, 40, 40);
				player2 = new Player(p2Number, 40, 80);
				System.out.println("Do you want to stop?  Enter 'q' to quit!  ");
				quit = input.next().charAt(0);
				quit = Character.toLowerCase(quit);
			}
			
			else if (newBall.outOfBounds()) {
				System.out.println("Ball is out of bounds, reset everything!  ");
				newBall = new Ball(40, 60, 0);
				player1 = new Player(p1Number, 40, 40);
				player2 = new Player(p2Number, 40, 80);
			}
			
			else if (player1.near(newBall) && !player2.near(newBall)
					&& (!newBall.p1Goal() && !newBall.p2Goal() && !newBall.outOfBounds())) {
				System.out.println("Player 1 is ready to kick the ball.  ");
				player1.kick(newBall);
			}
			
			else if (!player1.near(newBall) && player2.near(newBall)
					&& (!newBall.p1Goal() && !newBall.p2Goal() && !newBall.outOfBounds())) {
				System.out.println("Player 2 is ready to kick the ball.  ");
				player2.kick(newBall);
			}

			/**
			 * If both players near the ball, there is a 50% chance that one of them kicks
			 * the ball.
			 */
			else if (player1.near(newBall) && player2.near(newBall)
					&& (!newBall.p1Goal() && !newBall.p2Goal() && !newBall.outOfBounds())) {
				int random = (int)(Math.random() * 2 + 1); // random can be 1 or 2.
				if (random == 1) {
					System.out.println("Player 1 is ready to kick the ball.  ");
					player1.kick(newBall); // player1 kicks the ball if it's 1.
				} 
				else {
					System.out.println("Player 2 is ready to kick the ball.  ");
					player2.kick(newBall); // player2 kicks the ball if it's 2.
				}
			}
			
			else {
				System.out.println("Player 1 makes his movement...  ");
				System.out.print("Horizontal movement:  ");
				iX = input.nextInt();
				System.out.print("Vertical movement:  ");
				iY = input.nextInt();
				System.out.print("Jump height:  ");
				iZ = input.nextInt();
				player1.move(iX, iY);
				player1.jump(iZ);
				System.out.println("Player 2 makes his movement...  ");
				System.out.print("Horizontal movement:  ");
				iX = input.nextInt();
				System.out.print("Vertical movement:  ");
				iY = input.nextInt();
				System.out.print("Jump height:  ");
				iZ = input.nextInt();
				player2.move(iX, iY);
				player2.jump(iZ);
			}
			
		} 
		while (!(quit == ('q')));

		System.out.println("\nPlayer 1's final score:  " + p1Score + ".  ");
		System.out.println("Player 2's final score:  " + p2Score + ".  ");
		if (p1Score == p2Score) {
			System.out.println("Tie!  ");
		} 
		else if (p1Score > p2Score) {
			System.out.println("Player 1 wins!  ");
		} 
		else {
			System.out.println("Player 2 wins!  ");
		}

		input.close();

	}

}
