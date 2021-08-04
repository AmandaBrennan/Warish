import java.util.Random;

public class Card {
	public static final int Diamond =0;
	public static final int Heart = 1;
	public static final int Club = 2;
	public static final int Spade = 3;
	private int value;
	private int suit;
	
	
	
	public Card (int value, int suit) {
		this.value = value;
		this.setSuit(suit);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public String describeCard(int value, int suit) {
		switch(value) {
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			case 14: return "Ace";
			
			}
		
			return describeCard(value, suit);
	
		//return describeCard();
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	
}
	

