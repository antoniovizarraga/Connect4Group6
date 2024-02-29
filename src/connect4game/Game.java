package connect4game;

public class Game {
	// Esta función comprueba si el valor introducido está dentro del tablero.
	public static boolean validate(int column, char[][] board){
		
		
		//Si el valor de la columna es menor que 0 o mayor que el tablero devolverá falso.
		if (column < 0 || column > board[0].length){
			return false;
		}
		
		//Si el hueco no está vacío devolverá falso.
		if (board[0][column] != ' '){
			return false;
		}
		//En caso contrario devolverá verdadero
		return true;
	}
	
}
