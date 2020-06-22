public class InitializationOrderTrick {
	static { add(2); }
	static void add(int num) {System.out.print(num + " "); }
	InitializationOrderTrick() { add(5); }
	static { add(4); } 
	{ add(6); }
	static { new InitializationOrderTrick(); }
	{ add(8); }
	public static void main(String[] args) { 	}
}
