public class WrapperDistractors {
	public static void main (String[]args){
		String foo = "42";
		long bar = Long.parseLong(foo);
//		long baz = (new Long()).parseLong(foo); // no suitable constructor
//		long qux = Long.longValue(foo); // non-static method
		long quux = new Long(foo);
		long corge = Long.valueOf(foo).longValue();	
		System.out.println(Long.valueOf(baz));
	
		
	}
}