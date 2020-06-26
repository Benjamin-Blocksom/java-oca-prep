public class Pony extends Horse {
	public String trot (String speed) { System.out.println("Pony is trotting " + speed);}
	public int stomp(int times) {
	System.out.println("Quit stomping. Override only with a subclass of the parent method return type!"); 
	} 
}
