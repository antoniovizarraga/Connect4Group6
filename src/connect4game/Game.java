package connect4game;

public class Game {
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
			 * Print the number with a white space 
			 * and if its zero add an extra white space
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
}
