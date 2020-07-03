import java.util.Scanner;

class PickNumber {
	public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Pick a number from 1-100: ");

	String pick = sc.nextLine();
	int num = Integer.parseInt(pick);

	if (num < 0 || num > 100) 
		throw new IllegalArgumentException ("Must be between 1-100:");


	}
}
