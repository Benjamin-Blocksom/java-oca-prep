class ObjectReferenceTrick {
	public static void main (String[]args) {

	// 	deprecated API
	//	Integer red = new Integer(42);
	// 	See https://stackoverflow.com/questions/47095474/the-constructors-integerint-doubledouble-longlong-and-so-on-are-deprecat

		Integer red = Integer.valueOf(42);
		int herring = 13;
		redHerring(red++, ++herring);
		System.out.println(red + " " + herring);
	}

	public static void redHerring (Integer red, int herring) {
		red = herring++;
		red++;
	}
}