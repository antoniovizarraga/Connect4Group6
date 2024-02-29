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
}
