// This is it.

public class DogFour {
	private String breed;
	private int age;

	public DogFour(int age) {
		this(age, "Golden Retriever"); 
	}

	public DogFour(int age, String breed) {
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
