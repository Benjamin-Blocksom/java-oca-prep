abstract class PrintBeforeException {
	abstract void monkeyWrench();
	
	public static void main (String[]args) {
		System.out.println("I do this first");
		PrintBeforeException foo = null;
		foo.monkeyWrench();
		
		}
	}