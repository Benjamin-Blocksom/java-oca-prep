public class StringBuilderTrick {
	public void testReferences (String str, StringBuilder sb) {
		str = str + sb.toString();
		System.out.println("In testReferences. Variable str: " + str);

		sb.append(str);
		System.out.println("In testReferences. Variable str: " + sb); 

		str = null;
		sb = null;
		System.out.println("In testReferences. Variable str: " + str);
		System.out.println("In testReferences. Variable sb: " + sb);
	}
	
	public static void main (String[]args) {
	String s = "tik";
	StringBuilder sb = new StringBuilder ("tok");
	new StringBuilderTrick().testReferences(s, sb);
	System.out.println("s= " + s + " sb= " + sb);
	}	
}