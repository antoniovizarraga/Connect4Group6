package connect4game;

import java.util.Scanner;

public class Main {

	private static final int COLUMNS = 7;
	private static final int ROWS = 6;

	public static void main(String[] args) {
		// Scanner Object
		Scanner sc = new Scanner(System.in);

		// Array of the boar for the connect 4 game
		char[][] board = new char[ROWS][COLUMNS];

		// Inicializamos el Array del tablero.
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
		
		// Variable to cobntrol a valid play
		boolean validPlay;
		
		// Variable that save the column where the token is put
		int play;
		
		/*
		 * Lop that control all the game, and ends when the board is full or someone
		 * connected the four tokens
		 */
		while (!winner && turn <= (ROWS * COLUMNS)) {
			
			// A loop that only ends when a play is correct
			do {
				// Call to the function that print the board
				Game.display(board);

				System.out.print("Player " + player + ", choose a column: \n" );
				play = sc.nextInt();

				// Valida la jugada.
				validPlay = Game.validate(play,board);

			} while (!validPlay );

			// Bucle en el que meterá la ficha.
			/* Sustituirá el espacio por la ficha */
			for (int row = board.length - 1; row >= 0; row--) {
				if (board[row][play] == ' ') {
					board[row][play] = player;
					break;
				}
			}

			// Determinamos si hay un ganador.
			winner = Game.isWinner(player,board);

			// Cambio de turno
			if (player == 'R') {
				player = 'B';
			} else {
				player = 'R';
			}

			turn++;
		}
		Game.display(board);

		/* Comprueba quién ha ganado. */
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
