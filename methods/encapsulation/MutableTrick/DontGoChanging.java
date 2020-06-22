// Please, no sax solos.

public class DontGoChanging {
	public static void main (String[] args) {
		StringBuilder sb = new StringBuilder("don't go changing...");
		MutableTrick foo = new MutableTrick(sb);
		sb.append("(saxaphone solo)...");
		StringBuilder gotBuilder = foo.getMutableTrick();
		gotBuilder.append("(more sax)...");
		System.out.println(foo.getMutableTrick());

		StringBuilder sb2 = new StringBuilder("...just the way you are...");
		MutableFix bar = new MutableFix(sb2);
		sb2.append("(saxaphone solo)");
		StringBuilder gotFixBuilder = bar.getMutableFix();
		gotFixBuilder.append("(more saxaphone)");
		System.out.println(bar.getMutableFix());
	}
}

