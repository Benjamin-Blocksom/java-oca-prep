public class FooGarbageCollection{
  public Object doFoo(){
     Object foo = new String("bar");   // a
     Object fooArr[] = new Object[1]; // b
     fooArr[0] = foo; // c
     foo = null;      // d
     fooArr[0] = null;// e
     return foo;      // f
  }

  public static void main (String[]args){
  	FooGarbageCollection f = new FooGarbageCollection();
	System.out.println(f.doFoo());
  }
}
