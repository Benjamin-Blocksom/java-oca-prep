class ShortCircuitTrick {
	public static void main (String[]args) {
	int i = 0;
	
	boolean fake = true;
	boolean news = false;
	boolean fakeNews = false;
	
	fakeNews = ( news & strawMethod(i++));
	fakeNews = ( news && strawMethod(i++));
	fakeNews = ( fake | strawMethod(i++));
	fakeNews = ( fake || strawMethod(i++));
	System.out.println(i);	
	
	}

	public static boolean strawMethod(int i){
	return i > 0 ? true : false;
	}
	

}
