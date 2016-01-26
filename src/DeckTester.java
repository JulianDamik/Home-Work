/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","jack", "queen", "king", "ace"};

		String[] suits = {"hearts", "clubs", "spades", "diamonds"};

		int[] pointValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		Deck deck1 = new Deck(ranks, suits, pointValues);
		Deck deck2 = new Deck(ranks, suits, pointValues);
		Deck deck3 = new Deck(ranks, suits, pointValues);
		
		System.out.println(deck1.deal());
		
		
		
	}
}
