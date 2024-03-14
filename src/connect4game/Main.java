package connect4game;

public class Main {

	public static void main(String[] args) {
		/*
		 * Array where the board size is saved and it couldn't be mora than ten
		 */
		char[][] board = new char[10][10];

		// initialize array
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = 'a';
			}
		}
		// Call to the function to try it goes well
		Game.display(board);

	}

}
