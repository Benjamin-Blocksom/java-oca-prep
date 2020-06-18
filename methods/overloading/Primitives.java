public class Primitives {
  public void test(double d) {
  	System.out.print("double ");
  }
	
  public void test(float f) {
	  System.out.print("float ");
	  }
  public void test(int i) {
  	System.out.print("int ");
  	}
  public static void main(String[]args) {
  	Primitives p = new Primitives();
	p.test(1.0);
	p.test(1.0f);
	p.test(1);
  }

}

