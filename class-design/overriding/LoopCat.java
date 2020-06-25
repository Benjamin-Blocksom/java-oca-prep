public class LoopCat extends Cat {
	public double getWeight(){
	return getWeight()+12;
	}

	public static void main (String[]args) {
		System.out.println(new LoopCat().getWeight());	
	}
}
