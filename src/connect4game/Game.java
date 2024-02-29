package connect4game;

public class Game {
	// Esta función comprueba si el valor introducido es correcto, devolviendo true en el preciso. De no ser así devolverá false.
	//This function checks if the entered value is correct, returning true if necessary. Otherwise it will return false.
	public static boolean validate(int column, char[][] board){
		//Creamos la variable condition inicializada a true para guardar lo que devolvemos.
		//We create the condition variable initialized to true to save what we return.
		boolean condition=true;
		
		//Si el valor de la columna es menor que 0 o mayor que el tablero condition pasará a ser false.
		//If the column value is less than 0 or greater than the condition board, it will become false.
		if (column < 0 || column > board[0].length){
			condition= false;
		}
		
		//Si el hueco no está vacío condition pasará a ser false.
		//If the slot is not empty, condition will become false.
		if (board[0][column] != ' '){
			condition= false;
		}
		//Devuelve la variable condition.
		//Returns the condition variable.
		return condition;
	}
	
}
