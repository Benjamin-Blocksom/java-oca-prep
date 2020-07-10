class ValueToTheMax {
	public static void main (String[]args){
	int foo = Integer.MAX_VALUE;
	System.out.println("A Mersenne prime: " + foo);
	foo = foo + foo + foo;
	System.out.println("An int gone fubar: " + foo);
	}

}
