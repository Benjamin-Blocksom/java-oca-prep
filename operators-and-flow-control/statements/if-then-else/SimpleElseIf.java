class SimpleElseIf {
	public static void main (String[]args){
		int foo = 3;	
		
		if (foo < 2) { 
			System.out.println("This line doesn't run"); 
		} else if (false) {
			System.out.println("This line doesn't run either"); 
		} else {
			System.out.println("This line runs"); 
		}
	}

}