package mainlounge.entstaff;

import mainlounge.hospitality.CruiseDirector;

public class CruiseStaff {
	public void playsBingo() {
	CruiseDirector cruiseDirector = new CruiseDirector();
	cruiseDirector.playsBingo();
	System.out.println("Thanks " + cruiseDirector.name);
	}
}
