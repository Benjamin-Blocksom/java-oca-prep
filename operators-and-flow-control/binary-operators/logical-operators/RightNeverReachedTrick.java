class RightNeverReachedTrick {
	public static void main (String[]args){
	int x = 5;
	boolean y = ( x > 1) || (x++ < 6);
	System.out.println(x);
	}
}