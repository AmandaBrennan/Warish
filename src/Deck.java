import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

	public static final int allCards = 52;
	private Card[] deckOfCards;
	public Deck() {
		deckOfCards = new Card[allCards];
		int i = 0;
		for (int suit = Card.Diamond; suit <= Card.Spade; suit++) {
			for (int value = 2; value < 15 ; value++) {
				deckOfCards[i++]=new Card(suit, value);
			}
		}
		
	}
	public void printDeck() {
		// TODO Auto-generated method stub
		
	}

	public static Card drawCard() {
		Card i = null;
		// TODO Auto-generated method stub
		return i;
	}
	public void shuffle() {
		
	}
		
	
}
