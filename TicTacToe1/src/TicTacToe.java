// main()

public class TicTacToe {
	
	/**
	 * Method main
	 *hi
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		Game ticTacToe = new Game();
		UI display = new UI(ticTacToe);
		ticTacToe.setDisplay(display);
		ticTacToe.playGame();
	}	
}
