public class WheresTheBeefArray {
	public void distractYou(String [] foo) {
		int myIndex = 0;
		for (String str : foo) {
			str.concat(str + " " + myIndex);
			myIndex++;
		}
	}
	
	public void distractYouAgain(String [] foo) {
		for (String str : foo) {
		System.out.println(foo);
		} 
	}

	public static void main (String[]args) {
		WheresTheBeefArray wendy = new WheresTheBeefArray();
		String [] cheese = new String [42];
		wendy.distractYou(cheese);
		wendy.distractYouAgain(cheese);
	
	}

}
