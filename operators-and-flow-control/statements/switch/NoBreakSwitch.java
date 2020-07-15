class NoBreakSwitch {
	public static void main (String[]args) {
	
	int foo = 1;
	
	switch(foo) {
		default: 
			System.out.println("default");
		
		case 2:
			System.out.println("two");

		case 3:
			System.out.println("three");
			break;
		}
	}
}