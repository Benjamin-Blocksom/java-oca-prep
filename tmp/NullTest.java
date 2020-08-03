public class NullTest {
	public static void main (String[]args) {
		String foo = "foo";
		char[] myChar = {'f','o','o'}; 

		String bar = null;
		for ( char ch : myChar ) {
			bar = bar + ch;
		}

		System.out.println((foo == bar) + " " + (foo.equals(bar)));
		System.out.println(bar);
	}

}