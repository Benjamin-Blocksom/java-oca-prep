class EqualityTrick {
	public static void main (String[]args){
	String x = "Hello World";
	String y = "Hello World";
	System.out.println(x==y);
	

	String z = " Hello World".trim();
	System.out.println(x == z); 
	System.out.println(x.equals(z));


	String w = new String("Hello World");
	System.out.println(x == w);
	}
}

