// Demo of constructor overloading. 

public class Dog {
	private String breed;
	private int age;
	
	// First Constructor
	public Dog(int age) {
	this.age = age;
	breed = "Golden Retriever";
	}

	// Second Constructor
	public Dog(int age, String breed){
	this.age = age;
	this.breed = breed;
	}	
}

// This Dog is not DRY. How do we get the first constructor to call the second?
