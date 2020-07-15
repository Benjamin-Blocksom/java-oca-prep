public class SimplePromotion{
	
	public static Class<Integer> typeof(final int expr) {
 	 return Integer.TYPE;
	}
	
	public static Class<Long> typeof(final long expr) {
	  return Long.TYPE;
	}
	
	public static void main (String[]args){
	int foo = 1;
	long bar = 42;
	System.out.println(typeof(foo));	
	System.out.println(typeof(foo * bar));
	}
}
