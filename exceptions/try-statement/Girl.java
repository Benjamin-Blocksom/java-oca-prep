public class Girl {
	void walk() { }
	void fall() { 
		throw new RuntimeException();
	}
	void getUp(){ }
	
	void trip() {

	try {
		walk();
		fall();
	
		System.out.println("unreachable");
	
	} catch (RuntimeException e) {
		getUp();	
	}
	
	System.out.println("life goes on");
	}
}
