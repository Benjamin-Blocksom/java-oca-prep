// How many times did the Magician shuffle the deck?

public class ConstructorTricks {
	private String suit;
	private int cardNum;
	private int shuffleCount;

	public ConstructorTricks (int shuffleCount, int theCardNum) {
	shuffleCount = this.shuffleCount;
	cardNum = theCardNum;
	suit = "hearts";
	}

	public static void main (String[]args) {
	ConstructorTricks trick = new ConstructorTricks ( 5, 2);
        System.out.println("Times shuffled: " + trick.shuffleCount);
	System.out.println("Suit: " + trick.suit);
	System.out.println("Card number: " + trick.cardNum);	
	}
}
