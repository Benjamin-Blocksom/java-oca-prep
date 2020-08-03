public class OverridingDemo {
	public static void main (String[]args){
	Bar baz = new Baz();
	System.out.println(baz.doFoo(1, 2));
	}
}

class Foo {
	int doFoo(int a, int b) { if (a>b) return a; else return b;} 
}

class Bar extends Foo {
	int doFoo(int a, int b) { return 2 * super.doFoo(a, b); }
}

class Baz extends Bar {
	int doFoo(int a, int b) { return super.doFoo(2 * a, 2 * b);}
}

