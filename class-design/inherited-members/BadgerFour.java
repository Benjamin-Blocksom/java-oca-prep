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

public class BadgerFour extends Mammal{
	private int numberEars = 2;

	public BadgerFour(int age) {
	super(age);
	this.size = 11;
	}

// Your parent is `super`, your current class is just `this`.

	public void showDetails(){
	System.out.println("Badger Details.");	
	System.out.println("Age: " + super.getAge());
	System.out.println("Ears: " + this.numberEars);
	System.out.println("Size in lbs: " + super.size);
	}
}
