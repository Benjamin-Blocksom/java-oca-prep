class InitializationAintValueAssignment {
	public static void main (String[]args) {
		int x = 0;
		for (long y = 10, x = 1999; x < 5 && y > 6; x++, --y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		}
	}
}