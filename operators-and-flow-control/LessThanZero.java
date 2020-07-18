public class LessThanZero {
	public static void main (String[]args) {
		int i, j;
		for(i=0, j=0; j < i ; ++j, i++) { 
		System.out.println("red herring");
		}
		System.out.println("Why would " + j + " be less than " + i );
	}
}
