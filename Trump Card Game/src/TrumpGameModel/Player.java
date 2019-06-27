package TrumpGameModel;
import java.util.*;
public class Player {

	private String name; 
	private Deck deck; 
	private int points;
	private List<Card> playerCards;
	
	public Player(String name,Deck deck) {
		
		this.name = name;
		this.deck = deck;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void distributePlayerCards() {
		
		playerCards = new ArrayList<>();
		for(int i=0; i<13; i++) {
			
			playerCards.add(this.deck.getCard(0));
			this.deck.removeCard(0);
		}
	}
	
	public List<Card> getPlayerCards(){
		
		return playerCards;
	}
	
	public void increasePoints() {
		
		points++;
	}
	
	public int getPoints() {
		
		return points;
	}
	
	public String toString() {
		
		return this.name;
	}
}