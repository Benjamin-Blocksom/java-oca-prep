// Be careful. As of Java 9, the Boolean class
// no longer has the Boolean(String) constructor.
// The exam may try to trick you with an evaluation
// of two wrapper objects that both contain the value true.
// example: new Boolean("true") == Boolean.TRUE
// used to yield false. It no longer compiles as the API
// is deprecated.


import static java.lang.System.*;

class BoolCanHandleTheTruth {
	public static void main (String[] args) {
		Boolean b;
		String foo = "true";
		
		b = Boolean.valueOf(foo);
		out.print(b==Boolean.TRUE);
	}
}