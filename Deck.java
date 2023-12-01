package week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	List<Card> cards = new ArrayList<>();

	public Deck() {

		int offSet = 2;
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] names = { "Two", "Three", "Four", "Five", "Six", "Seven",
				"Eight", "Nine", "Ten", "Jack", "Queen","King", "Ace" };

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < names.length; j++) {
				cards.add(new Card(names[j], suits[i], j + offSet));
			}
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}

	public void shuffle() {
		Random rand = new Random();
		Card temp;
		for (int i = 0; i < cards.size(); i++) {
			int rndIndex = rand.nextInt(cards.size());
			temp = cards.get(i);
			cards.set(i, cards.get(rndIndex));
			cards.set(rndIndex, temp);
		}
	}

	public Card draw() {
		if (isDeckNotEmpty()) {
			return cards.remove(0);
		}
		return null;
	}

	public boolean isDeckNotEmpty() {
		return (cards.size() > 0);
	}
}
