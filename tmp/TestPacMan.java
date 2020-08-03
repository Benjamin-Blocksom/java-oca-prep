// Just goes to show you: when accessing
// a method or variable, the compiler will only
// allow you to access a method that is visible through
// the class of the reference.

interface ArcadeGame {String getName(); }

class PacMan implements ArcadeGame {
	public String name;
	public PacMan(String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	} 
}

class MsPacMan extends PacMan {
	public MsPacMan(String name) {
		super(name);
	}
}

public class TestPacMan {
	public static void main (String[]args) {
		ArcadeGame game = new MsPacMan("Super Ms. PacMan");
		System.out.println(((MsPacMan)game).getName());	
		System.out.println(((PacMan)game).getName());
		System.out.println(game.getName());		
	}

}