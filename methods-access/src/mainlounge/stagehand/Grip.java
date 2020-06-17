package mainlounge.stagehand;

import mainlounge.guestent.Magician;

public class Grip extends Magician {
	public void openTrapDoor() {
	disappear();
	System.out.println(text);
	}

	public void helpAssistantVanish() {
	Grip otherGrip = new Grip();
	otherGrip.disappear();
	System.out.println(text);
	}

	public void helpMagicianVanish() {
	Magician magician = new Magician();
	magician.disappear();
	System.out.println(text);
	}
}
