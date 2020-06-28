public class Anteater extends Pilosa {
	public static boolean isCool(){
	return true;
	}

	public void anteaterElevatorSpeach(){
	System.out.println("Do I eat ants?" + isCool());
	}

	public static void main (String[]args) {
	Anteater anteater = new Anteater();
	anteater.elevatorSpeach();
	anteater.anteaterElevatorSpeach();
	}
}
