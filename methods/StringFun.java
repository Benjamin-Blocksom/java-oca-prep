class StringFun {
	static double num = 42.0;
	
	public static void main (String... args) {
		new StringFun();
	}

	public StringFun() {
		System.out.println(this);
	}

	public String toString() {
		return "My static double called num: " + this.num;
	}
}