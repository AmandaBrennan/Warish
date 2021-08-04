import java.util.ArrayList;

public class Player {

	private ArrayList<Card> hand;
	private int score = 0;
	private String name;
	
	public Player(String name) {
		this.setHand(getHand());
		this.setScore(getScore());
		this.setName(name);
	}
	
	public void describePlayer() {
		System.out.println(this.name);
		System.out.println(this.hand);
		System.out.println(this.score);
	}
	
	public void flip() {
		
	}
	public void draw() {
		Card flipCard = Deck.drawCard();
		System.out.println(flipCard);
		this.hand.add(flipCard);
	}
	public void incrementScore() {
		this.score += 1;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void Draw(Deck fullDeck) {
		// TODO Auto-generated method stub
		
	}
}
