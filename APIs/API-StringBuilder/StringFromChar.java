public class StringFromChar {

	public static void main(String[]args) {
		String myStr = "foo";
		char [] charArr = {'f', 'o', 'o' };

		String newStr = null;
		System.out.println(newStr);

		for (char ch : charArr ) {
			newStr = newStr + ch;
		}
		
		System.out.println(newStr);
		System.out.println(newStr.equals(myStr));
	}
}
