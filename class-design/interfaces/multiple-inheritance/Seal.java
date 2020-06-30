// Does this break class method or interface rules?

public class Seal implements Swimmer, Schwimmer {
	
	public void canSwim() {
	System.out.println("Swimming");
	}

	public int canSwim() {
	return 13;
	}
}
