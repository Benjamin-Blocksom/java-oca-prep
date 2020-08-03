public class Main {
	public static void main (String[]args) {
	DogThree dog3 = new DogThree(3);
	DogFour dog4 = new DogFour(3);

	System.out.println((dog3.getAge()) 
			+ " " 
			+ (dog3.getBreed()));

	System.out.println((dog4.getAge()) + " " + (dog4.getBreed()));
	}
}
