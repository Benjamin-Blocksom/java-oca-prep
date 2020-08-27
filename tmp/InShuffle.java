// An 'in shuffle' is a perfect shuffle on a standard deck of 52 playing cards that splits the deck in half, the interleaves cards starting with the top half. 
//
// According to Wikipedia, an in shuffle moves the top card from the top to be the 2nd from the top. Another interesting piece of information from Wikipedia is that the number of `in shuffles` required to return a deck of cards of even size N to original order is the 2 % (n+1).
//
// In order for this to happen, the top card must be landing at the 26th position on the prior shuffle.

class InShuffle {
	static int [] deck = { 1, 2, 3, 4, 5, 6 };
	int [] result;

	
	public static void main (String[] args) { 
	for (int card : deck) {
		System.out.print(card + " ");
		}
	}
}
