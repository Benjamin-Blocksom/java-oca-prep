class LongValues {
    public static void main (String...args){
    	String s = "1234";

	// This does not compile. longValue( ) does not take
	// any parameters.
	// long l = Long.longValue(s);

	Long l = new Long(s);
	System.out.println(l);
    }
}
