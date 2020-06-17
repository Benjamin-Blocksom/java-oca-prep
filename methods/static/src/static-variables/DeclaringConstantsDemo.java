// Constants are not meant to change. To ensure this
// happens, use the `final` keyword. Constants
// have an unusual naming convention of being
// ALL_CAPS_WITH_WORDS_SPACED_BY_UNDERSCORE.

public class DeclaringConstantsDemo {
	private static final int SECRET_NUMBER = 12345;
	public static void main (String[]args) {
	SECRET_NUMBER = 42;
	}

}
