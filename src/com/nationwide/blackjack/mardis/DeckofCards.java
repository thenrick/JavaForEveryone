package com.nationwide.blackjack.mardis;

import java.util.ArrayList;

public class DeckofCards {

	ArrayList<Card> deck;

	public DeckofCards() {
		// need to build arraylist of 52 card objects

		deck = new ArrayList<Card>();

		String suitType = "";

		for (int s = 1; s < 5; s++) {
			switch (s) {
			case 1:
				suitType = "Diamond";
				break;
			case 2:
				suitType = "Heart";
				break;
			case 3:
				suitType = "Spade";
				break;
			case 4:
				suitType = "Club";
				break;
			}
			for (int n = 1; n < 14; n++) {
				Card card = new Card();
				switch (n) {
				case 1:
					card.cardNumber = "Ace";
					card.cardValue = 11;
					break;
				case 11:
					card.cardNumber = "Jack";
					card.cardValue = 10;
					break;
				case 12:
					card.cardNumber = "Queen";
					card.cardValue = 10;
					break;
				case 13:
					card.cardNumber = "King";
					card.cardValue = 10;
					break;
				default:
					card.cardNumber = Integer.toString(n);
					card.cardValue = n;
				}
				card.suit = suitType;
				deck.add(card);
			}
		}
	}

}
