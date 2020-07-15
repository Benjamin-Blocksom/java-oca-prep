class SimpleSwitch {
	public static void main (String[]args) {
	
	int foo = 1;
	
	switch(foo) {
		default: 
			System.out.println("default");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("default");
			break;
		}
	}
}