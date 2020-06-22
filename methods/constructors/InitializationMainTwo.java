public class InitializationMainTwo {
	private String name = "Waiting to be called";
	{ System.out.println(name);}
	static int COUNT = 0;
	static { System.out.println(COUNT);}
	{ COUNT += 42; System.out.println(COUNT);}
	public InitializationMainTwo() {
		System.out.println("In the constructor"); }
	
	public static void main (String[]args) {	
		System.out.println("read to construct");
		new InitializationMainTwo(); 
	}
}
