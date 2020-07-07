class StringBuilderMethodsDemo {
	public static void main (String []args){
		StringBuilder demo = new StringBuilder ("abracadabra");
		String sub = demo.substring(demo.indexOf("a"), demo.indexOf("ac"));
		int len = demo.length();
		char ch = demo.charAt(10);
		System.out.println(sub + " " 
				+ len + " " 
				+ ch);
	}
}


