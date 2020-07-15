public class PromotionTrick {
	// Overloading class to return type. Assume
	// that both methods compile.

		public static Class<Float> typeof(final float expr) {
 	 return Float.TYPE;
	}
	
	public static Class<Double> typeof(final double expr) {
	  return Double.TYPE;
	}

	// Does this compile? Run? Output?
	
	public static void main (String[]args) {
		double foo = 23.23;
		float bar = 23.2;

	// Assume method works (...which it does)
	System.out.println(typeof(foo*bar));	
	}
} 
