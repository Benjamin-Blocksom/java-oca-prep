public class caughtYourNull {
	public static int [] getchyerNullErr() { return null;}

	public static void main (String [] args) {
			int foo = 1;
		try {
			getchyerNullErr()[foo=2]++;
		} catch (Exception e) {
		System.out.println("Caught Null Pointer");
		}
		System.out.println(foo);
	}

}