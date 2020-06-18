// Variable assignments are only to the method
// parameter and do not affect caller.

class PassReferenceVariable {
	public static void main (String[]args) {
	
	String name = "foo";
	doSomething(name);
	System.out.println(name);
	}

public static void doSomething(String name) {
	name = "bar";
	}
}	
