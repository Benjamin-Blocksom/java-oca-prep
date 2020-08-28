// An 'in shuffle' is a perfect shuffle on a standard deck of 52 playing cards that splits the deck in half, then interleaves cards starting with the top half. 
//
// According to Wikipedia, an in shuffle moves the top card from the top to be the 2nd from the top. Another interesting piece of information from Wikipedia is that the number of `in shuffles` required to return a deck of cards of even size N to original order is the 2 % (n+1).

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class InShuffle {
	static Integer [] myDeck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 
			10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 
			20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
			30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
			40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
			50, 51, 52};

		
	// Does 'in shuffle'. An `in shuffle` first splits deck into two equal halves, then interleaves
	// the two halves beginning with the first card of the bottom pile. The original top card ends
	// up in the second position, which is array index [1].
	
	// Returns a copy of the array. To shuffle cards use a statement like myDeck = foo.shuffle();
	// where foo is an instance of the InShuffle class.

	Integer[] shuffle() {
		Integer [] result = myDeck.clone(); 
	        Integer [] topCut = Arrays.copyOfRange(result, 0, result.length/2);	
		Integer [] bottomCut = Arrays.copyOfRange(result, result.length/2, result.length);

		int topCounter = 0;
		int bottomCounter = 0;
		for (int i = 0; i < result.length; i++) {
		 result[i] = (i < 0 || i % 2 == 0) ? bottomCut[bottomCounter++] : topCut[topCounter++];
		} 

		return result;
	}

	// method for dealing cards
    void deal(Integer [] deck ) {
		for (int card : deck) {
			System.out.print(card + " ");
		}
	}

	// Find the index of a card
	int checkPosition (Integer card) {
		int i = 0;
		while(i < myDeck.length) {
			if (myDeck[i] == card) { 
				break; 
			}
			i++;
		}
		
		// testing where card is. TODO: remove during refactoring
		System.out.println();
		System.out.println("Card is at array index: " + i);
		System.out.println();

		return i;
	}

	// helper method to check if the first and last card are touching
	boolean checkFirstLast() {
			boolean flag = false;
			int position = 0;

			cards.checkPosition();
			// find index of first card. Replace magic number during refactor
			while(i < myDeck.length) {
				if (myDeck[i] == 1) { 
					break; 
				}
				i++;
			}

			

			// allow for deck to be at first and last index and only compare next and previous card, respectively
			// (not doing so would through ArrayIndexOutOfBounds exception).
			// otherwise check if the next or previous card is the BOTTOM_CARD.
			switch(i) {
				case 0: 
					if (myDeck[i+1] == 52) flag = true;
					break;
				case 51: 
					if (myDeck[i-1] == 52) { flag = true; }
					break; 	
				default: if(myDeck[i+1] == 52 || myDeck[i-1] == 52) flag = true;
					break;
				}

			return flag;
		}

	public static void main (String[] args) { 
		InShuffle cards = new InShuffle();
		final Integer TOP_CARD = myDeck[0];
		final Integer BOTTOM_CARD = myDeck[51];
		int counter = 0;
		

		for(int i = 0; i < 7; i++) {
			myDeck = cards.shuffle();
			cards.deal(myDeck);
			System.out.println("Shuffle: " + (i+1));
			System.out.println(cards.checkPosition(1));
		}

		// do {
		// 	myDeck = cards.shuffle();
		// 	counter++;
		// 	cards.deal(myDeck);
		//   } while (!(cards.checkFirstLast()) && (counter < 52));		
		//   if (counter == 52) {
		// 	  System.out.println("First and last cards never touch");
		//   } else { System.out.println("Shuffles for first and last cards to touch: " + counter); } 

		// // method for calculating number of times till top card returns to top
		// do {
		//   myDeck = cards.shuffle();
		//   counter++;
		// } while (myDeck[0] != TOP_CARD);

		// cards.deal(myDeck);
		// System.out.println("Times till deck returns to original order: " + counter);
		
		// // method for calculating first card is now bottom card;
		// counter = 0;
		// do {
		//   myDeck = cards.shuffle();
		//   counter++;
		//   if (counter > 52) {
		// 	System.out.println("The deck has returned to original order with the top card never hitting the bottom"); 
		// 	break;
		// 	}
		// } while (myDeck[51] != TOP_CARD);
		// if (counter < 52) { 
		// 	System.out.println("Shuffles for top card to be on the bottom: " + counter);
		// 	}

		// counter = 0;

	}
}
