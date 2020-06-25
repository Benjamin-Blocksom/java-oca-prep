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

public class Badger extends Mammal{
	private int numberEars = 2;

	public Badger(int age) {
	super(age);
	this.size = 11;
	}

	public void showDetails(){
	System.out.println("Badger Details.");	
	System.out.println("Age: " + getAge());
	System.out.println("Ears: " + numberEars);
	System.out.println("Size in lbs: " + size);
	}
}
