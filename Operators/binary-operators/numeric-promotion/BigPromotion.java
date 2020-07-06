public class BigPromotion {


	public static Class<Integer> typeof(final int expr) {
 	 return Integer.TYPE;
	}
	
	public static Class<Short> typeof(final short expr) {
	  return Short.TYPE;
	}

	public static Class<Double> typeof(final double expr) {
 	 return Double.TYPE;
	}

	public static Class<Float> typeof(final float expr) {
 	 return Float.TYPE;
	}

	public static void main (String[]args) {
		short foo = 2;
		float bar = 10;
		double baz = 5;
		System.out.println(typeof(foo * bar / baz));	

	}

}
