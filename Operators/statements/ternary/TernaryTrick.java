public class TernaryTrick {
	public static void main (String[]args){
	int foo = 42;
	System.out.println((foo > 50) ? 16 : "bar");
	int baz = ((foo > 50) ? 16 : "foobar");
	}
}