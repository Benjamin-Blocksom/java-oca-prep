class NoBreakSwitch {
	public static void main (String[]args) {
	
	int foo = 2;
	
	switch(foo) {
	
		case 2:
			System.out.println("two");

		default: 
			System.out.println("default");

		case 3:
			System.out.println("three");
			break;
		}
	}
}