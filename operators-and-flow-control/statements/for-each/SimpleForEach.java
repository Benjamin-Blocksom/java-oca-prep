class SimpleForEach {
	public static void main (String[]args){
		final String[] roster = new String[3];
		roster[0] = "Alice";
		roster[1] = "Bob";
		roster[2] = "Charley";

		for(String name : roster) {
			System.out.print(name + ", ");
		}
	}
}