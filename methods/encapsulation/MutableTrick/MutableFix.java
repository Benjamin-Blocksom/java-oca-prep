// Remember: a mutable object is one that can change
// state after construction. 
//
// You can fix the issues in MutableTrick.java
// by either making a defensive copy or 
// having the getter return a string.


public class MutableFix {
	private StringBuilder builder;

	public MutableFix (StringBuilder b) { 
		builder = new StringBuilder(b); 
	}

	public StringBuilder getMutableFix() {
		return new StringBuilder (builder);
	} 

}
