public class PromotionShort {

	public static Class<Integer> typeof(final int expr) {
 	 return Integer.TYPE;
	}
	
	public static Class<Short> typeof(final short expr) {
	  return Short.TYPE;
	}

	public static void main (String[]args) {
		short foo = 2;
		short bar = 3;
		System.out.println(typeof(foo*bar));	

	}

}
