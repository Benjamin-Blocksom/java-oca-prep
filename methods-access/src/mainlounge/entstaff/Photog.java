package mainlounge.entstaff;

import mainlounge.guestent.Magician;

public class Photog extends Magician {
  public void helpMagicianVanish(){
    Photog oldPro = new Photog();
    oldPro.disappear();
    System.out.println(oldPro.text);  
  }

  public void helpMagicianVanish() {
    Magician greenhorn = new Photog();
    greenhorn.disappear();
    System.out.println(greenhorn.text); 
  }
}
