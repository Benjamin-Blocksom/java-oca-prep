// Constructors are called by writing `new` before
// the name of the constructor.

public class DogThree {
	private String breed;
	private int age;
	
	public DogThree(int age) {
		new DogThree(age, "Golden Retriever");
	}
	public DogThree(int age, String breed) {
		this.age = age;
		this.breed = breed;
	}

	public int getAge() {
		return this.age;
	}

	public String getBreed() {
		return this.breed;
	}
}

	

// Careful: this compiles but doesn't do what we were looking at in Dog.java
// You must understand `this`. 
