// A demonstration of checking for object reference
// equality

public class User {
	String name; 
	public static void main(String[]args){
	User alice = new User();
	User bob = new User();
	User charlie = alice;
	System.out.println(alice == alice);
	System.out.println(alice == bob);
	System.out.println(alice.equals(bob));
	}
}
