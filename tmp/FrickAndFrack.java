class Frick {
	int x = 0;
	static int y = 1;
}

class Frack {
	int x = 4;
	static int y = 42;
}

public class FrickAndFrack {
	public static void main (String[]args) {
	System.out.println(new Frack().x + " " + new Frack().y); 
	}
}