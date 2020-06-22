// An immutable class allows initialization of
// instance variables with a value, but this cannot
// be changed since we omit the mutator method (setter).

public class ImmutableClass {
	private int unchangingValue;
	public ImmutableClass (int unchangingValue) {
	  this.unchangingValue = unchangingValue;
	}

	public int getUnchangingValue () {
		return this.unchangingValue;
	}

}
