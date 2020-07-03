public class BadShot {
	public void badShot() {
	try {	
		drawGun();
		} catch (LostDuel e) {
		System.out.println("well?");
		}
	}
	public void draw() throws LostDuel {
		drawGun();
	}		

	private static void drawGun() { }
}

