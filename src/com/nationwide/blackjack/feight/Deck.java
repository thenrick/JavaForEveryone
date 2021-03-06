package com.nationwide.blackjack.feight;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Suzanne Feight
 */

public class Deck {
	
	private final ArrayList<Card> deck;
	
	public Deck() {
		
		deck = new ArrayList<Card>();
		for (CardSuit suit : CardSuit.values()) {
			for (CardFace cardFace : CardFace.values()) {
				deck.add(new Card(suit, cardFace));
			}
		}
	}
	
	public void shuffleDeck(ArrayList<Card> gameDeck) {
		Collections.shuffle(gameDeck);
	}
	
	public ArrayList<Card> getNewDeck() {
		return deck;
	}


}
