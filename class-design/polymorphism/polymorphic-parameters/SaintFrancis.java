public class SaintFrancis {
	public static void bless(Animal animal) {
		System.out.println("St. Francis blesses the " + animal.getName());
	}

	public static void main (String[]args) {
		bless(new Animal());
		bless(new Bird());
		bless(new Butterfly());
	}
}
