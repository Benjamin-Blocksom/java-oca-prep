// Testing a poorly phrased test answer.


class MaxMethod {
	int max(int x, int y) {
		if(x>y) { return x; }
		else { return y; }
	}
	
	public static void main (String...args){
		MaxMethod maxxer = new MaxMethod();
		System.out.println(maxxer.max(4,5));
	}
}
