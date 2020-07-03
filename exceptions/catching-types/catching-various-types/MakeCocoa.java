public class MakeCocoa {
	public void pourHotWater() { }

	public void brewCocoa() {
		try {
			pourHotWater();
		} catch (RuntimeException e) {
			System.out.println("Oh no!");
		} catch (NoHotWater e) {
			System.out.println("No hot water!");
		}
	}

}
