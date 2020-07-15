// An underscore can occur between two digits
// and only between to digits

class underscoreNum {
	public static void main (String[]args) {
	int foo = 1_2_3;
	System.out.println(foo);
	
	// trick: a variable can be named _1_2_3
	int _1_2_3 = 1_2_3;
	int bar = _1_2_3;
	System.out.println(bar);

	// trick: multiple continuous underscores are allowed
	int baz = 1________________1;
	System.out.println(baz);

	
	}
}
