class Mammal {
	private int age;
	protected int size;

	public Mammal(int age) {
	this.age = age;
	}

	public int getAge(){
	return age;
	}
}

public class BadgerTwo extends Mammal{
	private int numberEars = 2;

	public BadgerTwo(int age) {
	super(age);
	this.size = 11;
	}

// The `this` keyword may be used for members of the
// current and parent class.

	public void showDetails(){
	System.out.println("Badger Details.");	
	System.out.println("Age: " + this.getAge());
	System.out.println("Ears: " + this.numberEars);
	System.out.println("Size in lbs: " + this.size);
	}
}
