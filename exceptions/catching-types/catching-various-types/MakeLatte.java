public class MakeLatte {
	public void makeEspresso() { }
	public void doLatte() {
	try {
		makeEspresso();
		} catch (NoWater e) {
		System.out.println("No water");
		} catch (NoHotWater e) {
		System.out.println("No hot water");
		}
	}


}
