public class MakeCoffee {
	public void brew() { }
	public void orderCoffee () {
		
	try {
	brew();
	} catch (NoGrounds e) {
	System.out.println("no coffee grounds");
	} catch (NoHotWater e) {
	System.out.println("no hot water");
	}
	
	}

}
