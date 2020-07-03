public class InfiniteRecursion {
	public static void pancakesForever(int num) {
		pancakesForever(num);
	}

	public static void main (String[]args) {
	// Throws StackOverflowError
	InfiniteRecursion foo = new InfiniteRecursion();
	foo.pancakesForever(1);
	}
}
