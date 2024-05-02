package connect4game;

import java.util.Scanner;

public class Main {

	// Variable for the columns of the board
	private static final int COLUMNS = 7;
	// Variable for the rows of the board
	private static final int ROWS = 6;

	public static void main(String[] args) {
		// Scanner Object
		Scanner sc = new Scanner(System.in);

		// Array of the boar for the connect 4 game
		char[][] board = new char[ROWS][COLUMNS];

		// Initialize the array of the board
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = ' ';
			}
		}

		/*
		 * Variable that represent the turn of the players
		 */
		int turn = 1;

		// Variable to save the player token
		char player = 'R';

		// Variable to know if someone wined
		boolean winner = false;
		
		// Variable to control a valid play
		boolean validPlay;
		
		// Variable that save the column where the token is put
		int play;
		
		/*
		 * Loop that control all the game, and ends when the board is full or someone
		 * connected the four tokens
		 */
		while (!winner && turn <= (ROWS * COLUMNS)) {
			
			// A loop that only ends when a play is correct
			do {
				// Call to the function that print the board
				Game.display(board);

				//Show the turn of the current player
				System.out.print("Player " + player + ", choose a column: \n" );
				play = sc.nextInt();

				// Check if the play is valid
				validPlay = Game.validate(play,board);

			} while (!validPlay );

			// Loop that will put the player token in the board
			/* Switch the white space with the player token*/
			for (int row = board.length - 1; row >= 0; row--) {
				if (board[row][play] == ' ') {
					board[row][play] = player;
					break;
				}
			}

			// Check if there is a winner
			winner = Game.isWinner(player,board);

			// Change the turn of the player
			if (player == 'R') {
				player = 'B';
			} else {
				player = 'R';
			}

			turn++;
		}
		Game.display(board);

		/* Check who player wined */
		if (winner) {
			if (player == 'R') {
				System.out.println("Black won");
			} else {
				System.out.println("Red won");
			}
		} else {
			System.out.println("Tie game");
		}

		sc.close();

	}

}
