public class Dancer implements Upper, UpAndDowner {
	
	public void getUp() {
	System.out.println("Get up");
	}
	
	public void getDown() {
	System.out.println("Get down");
	}

	public static void main (String[]args) {
	Dancer dancer = new Dancer();
	dancer.getUp();
	dancer.getDown();
	}
}
