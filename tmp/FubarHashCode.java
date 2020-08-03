// Yep, you can override that equals() method. The hashCode() method too.

class FubarHashCode extends Object {
	public boolean equals(Object obj) {
		return false;
	} 

	public int hashCode() {
		return 0;
	}

	public static void main (String[]args) {
		FubarHashCode foo = new FubarHashCode();
		FubarHashCode bar;
		bar = foo;
		System.out.println(foo);
		System.out.println(bar);
		System.out.println(foo.hashCode());
		System.out.println(bar.hashCode());
		System.out.println(foo.equals(bar));

	}
}