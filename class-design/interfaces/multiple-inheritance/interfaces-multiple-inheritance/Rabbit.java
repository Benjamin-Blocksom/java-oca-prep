// Clever rabbit overrides duplicate default methods

public class Rabbit implements Hop, Jump {
	public int jumpHeight() {
	return 5;
	}

	public static void main (String[]args) {
	System.out.println(new Rabbit().jumpHeight());
	}
}
