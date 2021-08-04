public class App {

	public static void main(String[] args) {
		
		Deck fullDeck = new Deck();
		Player player1 = new Player("Player one");
		Player player2 = new Player("Player two");
		
		player1.describePlayer();
		System.out.println("");
		player2.describePlayer();
		fullDeck.printDeck();
		
		fullDeck.shuffle();
		
		fullDeck.printDeck();
		
	
		System.out.println("The winner is");
		
	}

}
