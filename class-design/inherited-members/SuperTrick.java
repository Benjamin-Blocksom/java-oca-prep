public class SuperTrick { 
	private int level;

	public SuperTrick() {
		this.level = 1;
	}
	
	public SuperTrick(int level) {
	  this.level = level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}

class Mario extends SuperTrick {
	public Mario(int level) {
	super();
	super.setLevel(10);
	}
}

class Bowser extends SuperTrick {
	public Bowser(int level) {
	// super;
	super().setLevel(10);
	}
}
