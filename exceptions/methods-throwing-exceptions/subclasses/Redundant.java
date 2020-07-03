// Subclasses are free to throw runtime exceptions 
// not declared in superclass because they are redundant.
	
public class Redundant {
	public void doFoo() { }
}

class RedundantRuntime extends Redundant {
	public void doFoo() throws RuntimeException { }	
}
