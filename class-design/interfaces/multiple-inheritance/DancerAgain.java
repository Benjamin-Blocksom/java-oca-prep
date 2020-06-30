public class DancerAgain implements UpAgain, UpAgainAndAgain {
	public void getUpAgain() {
	System.out.println("Get Up!");
	}

	public int getUpAgainAndAgain(int num) {
	for (int i = 0; i < num; i++) {
	System.out.println("Up again! For this many times: " + i);
	} 
	return 0;
	}
}
