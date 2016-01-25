
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		
		
		Card card1 = new Card("ace" , "dimands", 2);
		Card card2 = new Card("king", "clubs" , 3);
		Card card3 = new Card("queen", "spades", 4);
		
		System.out.println(card1.suit());
		System.out.println(card2.pointValue());
		System.out.println(card3.rank());
		System.out.println(card1);
	}
}

