class EqualityTrick {
	public static void main (String[]args) {
	boolean foo = true;
	boolean bar = (foo = false);
	System.out.println(bar);
	}
}