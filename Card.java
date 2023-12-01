package week05;

public class Card {

	private String name;
	private String suit;
	private int value;
	
	public Card() {
		
	}
	public Card(String name, String suit, int value) {
		setName(name);
		setSuit(suit);
		setValue(value);
	}
	public void describe() {
		System.out.println(getName() +" of " + getSuit()+ ", value: "+getValue());
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return getName() +" of " + getSuit()+ ", value: "+getValue();
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
