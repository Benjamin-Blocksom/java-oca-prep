public class MakeTea {
	public void pourHotWater() { }

	public void steepTea() {
	try {
		pourHotWater();
	} catch (NoHotWater e) {
		System.out.println("No hot water");
	} catch (NoWater e) {
		System.out.println("No water");
		}
	}
}
