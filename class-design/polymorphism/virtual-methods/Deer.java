// A method is virtual when it is not determined until runtime

public class Deer extends Animal {
	public String getName(){
	return "Deer";
	}

	public static void main (String args[]){
		Animal animal = new Deer();
		animal.showName();
	}
}
