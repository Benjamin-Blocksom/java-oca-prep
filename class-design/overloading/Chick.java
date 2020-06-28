public class Chick extends Chicken {
	protected int weight = 1;
	public void getWeightDetails() {
	System.out.println("Chick weight: " + weight);
	}

	public static void main (String[]args) {
	Chick chick = new Chick();
	chick.getChickenWeightDetails();
	chick.getWeightDetails();
	}
}
