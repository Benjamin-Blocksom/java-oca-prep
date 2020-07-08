class Hands {
	public static void main (String[]args) {
	int[][] hands = {{10, 7, 5, 3, 4}, {3, 6, 7, 4, 1}, { 1, 2, 8, 9, 0}};
	for( int[] hand : hands ) {
		for(int i = 0; i < hand.length ; i++) {
			System.out.print(hand[i] + "\t");
		}
		System.out.println();
		} 
	}
}