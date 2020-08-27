public class MethodHidingFun {
	
	public static void main (String... args) {
		Foo foo = new Bar();
		System.out.println(foo.i);
		foo.doWatusi();
		foo.doFandango();
	}

}

class Foo {
	int i = 13;
	public static void doWatusi () { System.out.println("Doing the watusi in class Foo"); }
	public void doFandango () { System.out.println("Doing the fandango in class Foo"); }
}

class Bar extends Foo {
	int i = 42;
	
	public static void doWatusi () { System.out.println("Doing the watusi in class Bar"); }
	public void doFandango () { 
		System.out.println("Doing the fandango in class Bar"); 
		this.doWatusi();
	}
	
}