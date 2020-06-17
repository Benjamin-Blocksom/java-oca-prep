// Who needs to disappear for this to compile? Why?

package mainlounge.driver;
import mainlounge.guestent.Magician;
import mainlounge.guestent.Assistant;
import mainlounge.entstaff.Dancer;
// import mainlounge.entstaff.Photog;
import mainlounge.entstaff.CruiseStaff;

public class Main {
    public static void main (String[]args){

//    Magician magician = new Magician();
//    magician.disappear();

    Assistant assistant = new Assistant();
    assistant.helpMagician();

    Dancer dancer = new Dancer();
    dancer.vanish();

//    Photog photog = new Photog();
//    photog.helpMagicianVanish();    

	CruiseStaff cruiseStaff = new CruiseStaff();
	cruiseStaff.playsBingo();

    }
}
