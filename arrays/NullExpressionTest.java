class NullExpressionTest {
	public static int [ ] getArray() { 
		int foo[] = {1, 2, 3}; 
		return null;
	}

	public static void main(String[] args) {


		int index = 1;
		try {
		  getArray()[index=2]++;
		} catch (Exception e) { }
		System.out.println("index = " + index);
	}
}
