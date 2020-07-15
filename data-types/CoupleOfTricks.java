// Try running at command line with java CoupleOfTricks --0.50
// (That passes a string of 6 chars as the parameter of args.)

class CoupleOfTricks {

	public static void main (String[]args) {
		try {
			switch(switcheroo(args[0])) {
				case 0: System.out.println("Forgot my break statement, so I go on.");
				case 1: System.out.println("I have a break statement, so no default"); break;
				default: System.out.println("Insert meme here");
				}
			} catch (Exception e) { 
				System.out.println("Please pass in a value");
				System.out.println("Example: java CoupleOfTricks --0.50");
			} 
	} 

	public static int switcheroo(String foo) {
		return (int) Math.round(Double.parseDouble(foo.substring(1, foo.length()-1)) );
	}

}