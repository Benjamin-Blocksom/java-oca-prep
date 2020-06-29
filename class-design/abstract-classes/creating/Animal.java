// An abstract class is marked by the 
// abstract keyword and cannot be 
// instantiated.

public abstract class Animal {
	protected int age;
	public void sleep () {
	System.out.println("Animal is sleeping");
	}
	public abstract String getName();
}
