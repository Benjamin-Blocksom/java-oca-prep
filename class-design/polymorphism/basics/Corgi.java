public class Corgi extends Dog implements WagsTail {
	public String wag() {
	return "wagging stump";
	}

	public int age = 5;

	public static void main (String[]args) {
		Corgi corgi = new Corgi();
		System.out.println(corgi.age);

		WagsTail wagsTail = corgi;
		System.out.println(wagsTail.wag());

//		System.out.println(wagsTail.age);  // does not compile

		Dog dog = corgi;
		System.out.println(dog.isFurry());
		// System.out.println(dog.wag());  // does not compile
		
		// Corgi corgiX = dog; // does not compile
					
		Corgi corgi2 = (Corgi)dog;
		System.out.println(corgi2.age);

		
	}
}
