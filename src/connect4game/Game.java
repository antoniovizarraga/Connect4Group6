package connect4game;

public class Game {
	// Esta clase es donde va el juego

	// method that will check if there's a winner, input parameters are the player (if there's a checker) and the board itself.
	public static boolean isWinner(char player, char[][] board) {
		//Initialize the variable condition as false.
		boolean condition = false;
		//
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				if (board[row][col] == player && board[row][col + 1] == player && board[row][col + 2] == player
						&& board[row][col + 3] == player) {
					condition = true;
				}
			}
		}
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				if (board[row][col] == player && board[row][col + 1] == player && board[row][col + 2] == player
						&& board[row][col + 3] == player) {
					condition = true;
				}
			}
		}
		for (int row = 3; row < board.length; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				if (board[row][col] == player && board[row - 1][col + 1] == player && board[row - 2][col + 2] == player
						&& board[row - 3][col + 3] == player) {
					condition = true;
				}
			}
		}
		// check downward diagonal
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
