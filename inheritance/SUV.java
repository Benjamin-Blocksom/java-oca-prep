class Automobile {
	public void drive() {
	  System.out.println("Driving automobile");
	}
}

public class SUV extends Automobile {
	public void drive() {
	  System.out.println("Driving SUV");
	}

	public static void main (String[]args){
	  Automobile a = new Automobile();
	  SUV suv = new SUV();
	  a.drive();
	  suv.drive();
	  a = suv;
	  a.drive();
	  suv = (SUV) a;
	  suv.drive();

	}
}
