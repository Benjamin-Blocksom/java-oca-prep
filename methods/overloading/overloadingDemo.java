class OverloadingDemo {
	public static void main (String[]args){
		int order = 100;
		short smallOrder = 3;
	
		makeFries(order);
		makeFries(smallOrder);
	}
	
	public static void makeFries(int fries){
	System.out.println("cooking up " + fries + " fries.");
	}
	public static void makeFries(short fry){
	System.out.println("just " + fry + " fries.");
	}

}
