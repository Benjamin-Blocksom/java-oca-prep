// When an instance method calls another instance method,
// it gets an implicit `this`.

class ThatAintThis {
	void howBoutThis(){
		ThatAintThis.noInstanceNeeded();
		seriouslyNoInstanceNeeded();
		ThatAintThis.howBoutThis(); // Won't compile
	}
	
	void howBoutThat(){
		// The next two get an implicit `this`
		howBoutThis();
		noInstanceNeeded();
		// The next one doesn't compile
		ThatAintThis.howBoutThat();
	}

	static void noInstanceNeeded() { }
	static void seriouslyNoInstanceNeeded () { }
}
