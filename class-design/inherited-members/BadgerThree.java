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

public class BadgerThree extends Mammal{
	private int numberEars = 2;

	public BadgerThree(int age) {
	super(age);
	this.size = 11;
	}

// The `this` keyword may be used for members of the
// current class. It, along with 'super', may be used
// with members of the parent class.

	public void showDetails(){
	System.out.println("Badger Details.");	
	System.out.println("Age: " + super.getAge());
	System.out.println("Ears: " + this.numberEars);
	System.out.println("Size in lbs: " + super.size);
	}
}
