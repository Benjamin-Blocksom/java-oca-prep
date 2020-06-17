public class FlowersOnTheWall {
	public static int count;
	public static void addFlower() { count++; }
	public void addDaisy() { count++;}
	public void showFlowers() {
		addFlower();
		addDaisy();
	}
	public static void showAllFlowers(){
		addFlower();
		addDaisy();
	}
	public int total;
	public static int average = total / count;
}
