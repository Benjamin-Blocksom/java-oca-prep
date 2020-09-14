class TryShadowTrick {
	String global = "Batman";

	public int doShadowTrick(String arg) {
		int value = 0;
		
		try {
		String global = arg;
		value = Integer.parseInt(global);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(global + " " + value);
		return value;
	}

	public static void main (String[]args){
		TryShadowTrick foo = new TryShadowTrick();
		System.out.println(foo.doShadowTrick("189"));
	}
}
