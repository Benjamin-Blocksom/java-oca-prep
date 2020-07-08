class SimpleNestedLoop {
	public static void main (String[]args){
		int foo = 20;
		while (foo > 0) {
		do { foo -= 2; } while ( foo > 5);
		foo--;
		System.out.println(foo);
		}
	}
}