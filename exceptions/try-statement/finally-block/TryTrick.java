public class TryTrick {
	void fall() { throw new RuntimeException(); }
	void getBackUp () { }
	void goOnWithLife() { }

	void easyOut() {
	try {
		fall();
	} finally { goOnWithLife();
	} catch (Exception e) {
		getBackUp();
		} 
	}

	void neverEnding(){
	try { getBackUp(); }
	}

	void noProblems() {
	try {
		getBackUp();
	} finally { 
		goOnWithLife();
	} 
	}

}
