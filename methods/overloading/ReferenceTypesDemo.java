public class ReferenceTypesDemo {
	public void test(String string) {
	System.out.print("string ");
	}	

	public void test(Object object) {
	System.out.print("object ");
	}
	public static void main(String[] args) {
	  ReferenceTypesDemo r = new ReferenceTypesDemo();
	  r.test("test");
	  r.test(42);
	}
}
