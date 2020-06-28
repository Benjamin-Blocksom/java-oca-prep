// Sleepy method is not hidden. It's overridden.  
class Sloth extends Pilosa {
	public boolean isSleepy() {
	return true;
	}

	public void getSlothDescription() {
	System.out.println("Sloth is sleepy: " + isSleepy());
	}

	public static void main (String[]args){
	Sloth sloth = new Sloth();
	sloth.getDescription();
	sloth.getSlothDescription();
	}
}
