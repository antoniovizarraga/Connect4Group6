package connect4game;

import java.util.Scanner;

public class Main {

	private static final int COLUMNS = 6;
	private static final int ROWS = 6;

	public static void main(String[] args) {
		// Objeto Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos el tablero del conecta 4.
		char[][] board = new char[ROWS][COLUMNS];

		// Inicializamos el Array del tablero.
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = ' ';
			}
		}

		// Variable que representará los turnos que van pasando
		// en el transcurso de la partida.
		int turn = 1;

		// Variable que representará el turno actual del jugador.
		char player = 'R';

		// Variable que indicará quién ganará.
		boolean winner = false;

		// Bucle en el que se iniciará la partida.
		/*
		 * Multiplicamos la cantidad de filas por columnas ya que ese será la cantidad
		 * máxima de turnos que puede haber en una partida.
		 */
		while (winner == false && turn <= (ROWS * COLUMNS)) {
			boolean validPlay;
			int play;
			do {
				// display(board);

				System.out.print("Jugador " + player + ", elija una columna: ");
				play = sc.nextInt();

				// Valida la jugada.
				// validPlay = validate(play,board);

			} while (validPlay == false);

			// Bucle en el que meterá la ficha.
			/* Sustituirá el espacio por la ficha */
			for (int row = board.length - 1; row >= 0; row--) {
				if (board[row][play] == ' ') {
					board[row][play] = player;
					break;
				}
			}

			// Determinamos si hay un ganador.
			// winner = isWinner(player,board);

			// Cambio de turno
			if (player == 'R') {
				player = 'B';
			} else {
				player = 'R';
			}

			turn++;
		}
		// display(board);

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

		/*
		 * Array where the board size is saved and it couldn't be mora than ten
		 */
		char[][] board = new char[10][10];

		// initialize array
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = ' ';
			}
		}
		
		Game.display(board);

	}

}
