public class Main {
	public static void main (String[]args) {
	ImmutableClass foo = new ImmutableClass(42);
	System.out.print(foo.getUnchangingValue());
	}
}
