// Try replacing the short-circuit operator `&&` in the 
// if statement with the logical operator `&`

import java.util.Scanner;

class CheckNullInput {
	public static void main (String[]args){
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter something: ");
	String myInput = obj.nextLine();
	myInput = null;	
	

	if (myInput != null && !myInput.isEmpty()) { 
		System.out.println("You entered: " + myInput);
	} else {
		System.out.println("Invalid input.");
	}
	
	}
}