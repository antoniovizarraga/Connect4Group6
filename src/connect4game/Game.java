package connect4game;

public class Game {
	// Esta función comprueba si el valor introducido está dentro del tablero.
	public static boolean validate(int column, char[][] board){
		//creamos la variable condition inicializada a true para guardar lo que devolvemos.
		boolean condition=true;
		
		//Si el valor de la columna es menor que 0 o mayor que el tablero condition pasará a ser false.
		if (column < 0 || column > board[0].length){
			condition= false;
		}
		
		//Si el hueco no está vacío condition pasará a ser false.
		if (board[0][column] != ' '){
			condition= false;
		}
		//Devuelve la variable condition
		return condition;
	}
	
}
