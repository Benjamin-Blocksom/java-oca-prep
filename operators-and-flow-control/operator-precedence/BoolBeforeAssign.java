class BoolBeforeAssign {
	public static void main (String[]args) {
		boolean foo = true;
		boolean bar = false;

	if (foo != bar = !foo) {System.out.println("Do I get printed?");}

	}

}