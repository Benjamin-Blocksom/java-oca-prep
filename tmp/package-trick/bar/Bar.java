// Watch the default constructor
package bar;

import foo.*;

public class Bar extends Foo {
	Bar() { }
	public void print(){ System.out.println("A"); }
	public static void main (String[]args) {
		new B();
	}
}