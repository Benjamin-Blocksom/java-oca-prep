// Default instance variables? Null.

public class InstanceVariableDefault {
	String isNull;

	public void test() throws NullPointerException {
		System.out.println(isNull.length());
	}

	public static void main (String[]args){
	InstanceVariableDefault dontUseSuchLongVariableAndClassNames = new InstanceVariableDefault();
	dontUseSuchLongVariableAndClassNames.test();	
	}
}
