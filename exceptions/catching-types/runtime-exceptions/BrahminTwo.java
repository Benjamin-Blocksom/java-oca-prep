public class BrahminTwo {
	String brahmin = "brahmin";
	Object obj = brahmin;
	Integer dude = (Integer) obj;

	public static void main (String[]args) {
		BrahminTwo test = new BrahminTwo();
	 	System.out.println(test.dude);	
	}	
}
