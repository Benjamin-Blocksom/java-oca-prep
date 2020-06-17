public class StillAnIllusionist {
	public static void nullHappens() {
	  Illusionist mrFiftyTwo = new Illusionist();
	  System.out.println(mrFiftyTwo.count);
	  mrFiftyTwo = null;
	  System.out.println(mrFiftyTwo.count);
	}
}
