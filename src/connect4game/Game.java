package connect4game;

public class Game {

	// Esta clase es donde va el juego
	/**
	 * Function for painting the board of the game
	 * @param board The board to paint
	 */
	public static void display(char[][] board){
		/*
		 * Loop where the number at the top of the board is printed
		 */
		for(int col = 0; col < board.length; col++) {
			/*
			 * Print the number and if its zero add an extra white space
			 */
			if(col == 0) {
				System.out.print("   " + col + " ");
			}else {
				System.out.print(col + " ");
			}
		}
		// Line break to start printing the rest of the board
		System.out.println();
		
		/*
		 * Loop where the board is printed
		 */
		for (int row = 0; row < board.length; row++) {
			System.out.print(row + " ");
			System.out.print("|");
			for (int col = 0; col < board[0].length; col++) {
				System.out.print(board[row][col]);
				System.out.print("|");
			}
			System.out.println();
		}
		System.out.println();
}

	// method that will check if there's a winner, input parameters are the player (if there's a checker) and the board itself.
	public static boolean isWinner(char player, char[][] board) {
		//Initialize the variable condition as false (there's no winner).
		boolean condition = false;
		//For loop that will check if there're 4 checkers one after another in a row
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				//player represents the checker
				if (board[row][col] == player && board[row][col + 1] == player && board[row][col + 2] == player
						&& board[row][col + 3] == player) {
					//if the condition is met it changes it to true
					condition = true;
				}
			}
		}
		//For loop that will check if there're 4 checkers in a column
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				if (board[row][col] == player && board[row][col + 1] == player && board[row][col + 2] == player
						&& board[row][col + 3] == player) {
					condition = true;
				}
			}
		}
		//For loop that will check if there're 4 checkers in a upward diagonally
		for (int row = 3; row < board.length; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				if (board[row][col] == player && board[row - 1][col + 1] == player && board[row - 2][col + 2] == player
						&& board[row - 3][col + 3] == player) {
					condition = true;
				}
			}
		}
		// check downward diagonally
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
}
