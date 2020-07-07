import java.io.File;

class EqualOnlyIfSameObject {
	public static void main (String[]args) {
	File foo = new File("foo.md");
	File bar = new File("foo.md");
	File baz = foo;

	System.out.println(foo == bar);
	System.out.println(foo == baz);
	}
}