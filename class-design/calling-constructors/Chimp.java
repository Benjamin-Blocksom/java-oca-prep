class Primate {
	public Primate() {
	System.out.println("Primate");
	}
}

class Ape extends Primate {
	public Ape () {
	System.out.println("Ape");
	}
}

class Chimp extends Ape {
	public static void main (String[]args) {
	new Chimp();	
	}
}
