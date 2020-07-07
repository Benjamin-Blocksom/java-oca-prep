public class TernaryTrickTwo {
	public static void main (String[]args){
	int foo = 42;
	int bar = 42;
	
	final int baz = bar>= 41 ? foo++ : bar++;
	System.out.println("foo: " + foo);
	System.out.println("bar: " + bar);
	
	final int qux = bar>= 44 ? foo++ : bar++;
	System.out.println("foo: " + foo);
	System.out.println("bar: " + bar);
	}
}