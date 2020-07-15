// Optional labels follow same rules as identifiers
// but are generally written in uppercase.

class SimpleNestedLoopLabeled {
	public static void main (String[]args){
		int foo = 20;
		OUTER_LOOP: while (foo > 0) {
			INNER_LOOP: do { foo -= 2; } 
				    while ( foo > 5);
			foo--;
		System.out.println(foo);
		}
	}
}