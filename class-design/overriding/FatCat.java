public class FatCat extends Cat {
	public double getWeight() {
	return super.getWeight() + 12;
	}

	public static void main (String[]args) {
	System.out.println(new Cat().getWeight());
	System.out.println(new FatCat().getWeight());
	}
}	
