class OperandTest {
	public static void main (String[]args) {
	byte b1 = 1;
	byte b2 = 2;

	// Operand will convert smaller types to int.
	int i = b1 + b2;

	// To assign to something other than int, a cast is needed
	byte b = (byte) (b1 + b2);

	// If one operand is long, float, or double, the result 
	// will be its respective long, float, or double type.
	long l1 = 1234_5678_9012_3456L;
	long l = l1 + b1;
	
	System.out.println(i + " "  + b + " " + l);
	}
}
