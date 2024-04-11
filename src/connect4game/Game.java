package connect4game;

public class Game {

	/**
	 * Function for painting the board of the game
	 * 
	 * @param board The board to paint
	 */
	public static void display(char[][] board) {
		/*
		 * Loop where the number at the top of the board is printed
		 */
		for (int col = 0; col < board.length; col++) {
			/*
			 * Print the number with a white space and if its zero add an extra white space
			 */
			if (col == 0) {
				System.out.print("   " + col + " ");
			} else {
				System.out.print(col + " ");
			}
		}
		// Line break to start printing the rest of the board
		System.out.println();

		/*
		 * Loop where the board is printed, the first loop print the rows
		 */
		for (int row = 0; row < board.length; row++) {
			/*
			 * Print the number at the start of the row
			 */
			System.out.print(row + " ");
			System.out.print("|");
			/*
			 * Another loop that print each column
			 */
			for (int col = 0; col < board[0].length; col++) {
				// Print the value inside of that position in the array
				System.out.print(board[row][col]);
				// Print a separator
				System.out.print("|");
			}
			// Print a line break
			System.out.println();
		}
		// Print a line break
		System.out.println();
	}

	// method that will check if there's a winner, input parameters are the player
	// (if there's a checker) and the board itself.
	public static boolean isWinner(char player, char[][] board) {
		// For loop that will check if there're 4 checkers one after another in a row
		boolean condition = false;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				// player represents the checker
				if (board[row][col] == player && board[row][col + 1] == player && board[row][col + 2] == player
						&& board[row][col + 3] == player) {
					// if the condition is met it returns true
					condition = true;
				}
			}
		}

		// For loop that will check if there're 4 checkers in a column
		for (int row = 0; row < board.length - 3; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (board[row][col] == player && board[row + 1][col] == player && board[row + 2][col] == player
						&& board[row + 3][col] == player) {
					condition = true;
				}
			}
		}

		// For loop that will check if there're 4 checkers in an upward diagonal
		for (int row = 3; row < board.length; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				if (board[row][col] == player && board[row - 1][col + 1] == player && board[row - 2][col + 2] == player
						&& board[row - 3][col + 3] == player) {
					condition = true;
				}
			}
		}

		// Check downward diagonally
		for (int row = 0; row < board.length - 3; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				if (board[row][col] == player && board[row + 1][col + 1] == player && board[row + 2][col + 2] == player
						&& board[row + 3][col + 3] == player) {
					condition = true;
				}
			}
		}
		return condition;
	}

	// This function checks if the entered value is correct, returning true if
	// necessary. Otherwise it will return false.
	public static boolean validate(int column, char[][] board) {

		// We create the condition variable initialized to true to save what we return.
		boolean condition = true;

		// If the column value is less than 0 or greater than the condition board, it
		// will become false.
		if (column < 0 || column > board[0].length) {
			condition = false;
		}

		// If the slot is not empty, condition will become false.
		if (board[0][column] != ' ') {
			condition = false;
		}

		// Returns the condition variable.
		return condition;
	}

}