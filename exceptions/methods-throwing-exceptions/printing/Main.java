public class Main {

	public static void main (String[]args) {
		try {
		foo();
		} catch (Exception e) {
		System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	}

	private static void foo() {
		throw new RuntimeException("foo on you");
	}
	
}
