package mainlounge.guest;

import mainlounge.guestent.Magician;

public class Cone {
	public void watchMagician() {
		Magician magician = new Magician();
		magician.disappear();
		System.out.println(magician.text);
	}
}

