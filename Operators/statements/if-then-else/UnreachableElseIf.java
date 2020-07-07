class UnreachableElseIf {
	public static void main (String[]args){
		int foo = 3;	
		
		if (foo < 5) { 
			System.out.println("This line is reachable"); 
		} else if (foo < 4) {
			System.out.println("This code is unreachable"); 
		} else {
			System.out.println("This line  doesn't run"); 
		}
	}

}