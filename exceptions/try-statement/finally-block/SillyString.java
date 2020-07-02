public class SillyString {
	public static void main (String[]args){
		String s = "";

		try {
		 s += "silly";
		} catch (Exception e) {
		s += " rabbit. Tricks are for ";
		} finally { 
		 s += " strings";
		}
		System.out.println(s);
	
	}
}
