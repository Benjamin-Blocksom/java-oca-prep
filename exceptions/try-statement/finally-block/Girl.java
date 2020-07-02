public class Girl {
	void fall () { throw new RuntimeException(); }
	void getsHelpUp() { }
	void goesOn() { }
	
	
	void walk() {
	try {
		fall();
	} catch (Exception e) {
		getsHelpUp();
	} finally {
		goesOn();
	}
	}

}
