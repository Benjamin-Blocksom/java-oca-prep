// Multiplicative operators (*, /, %) have a higher order of precedence
// than additive (+, -)

public class MultiplyBeforeAdd {
	public static void main (String[]args) {
	int x = 4 * 2 + 3 * 5;
	System.out.println(x);
	}

}
