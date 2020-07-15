class BasicAssignment {
	public static void main (String[]args){
	int foo = 1, bar = 2;
	foo = foo * bar;
	bar *= foo;
	System.out.println("Foo: " + foo);
	System.out.println("Bar: " + bar);
	}
}