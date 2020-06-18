class CallingAllCars {
	public static String call(int i) {
	return "police car";
	}

	public static String call(int i, int j) {
		return "fire engine";
	}

	public static String call(int... i) {
		return "ambulance";
	}

	public static String call (Object o) {
		return "calling all cars";
	}

	public static void main (String[]args) {
		System.out.println(call(1));
		System.out.println(call(1,2));
		System.out.println(call(1,2,3));

		CallingAllCars o = new CallingAllCars();
		System.out.println(call(o));
	}

}
