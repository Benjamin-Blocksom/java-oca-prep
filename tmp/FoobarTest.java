class Foo { }

class Bar extends Foo { }

public class FoobarTest {
	public static void main (String[]args) {
	Foo foo = new Foo();
	Bar bar = new Bar();
	foo = bar;
	System.out.println("foo: " + foo.getClass());
	System.out.println("bar: " + bar.getClass());	 
	}
}