interface Ba { }

interface Nan { 
	void fooD();
}

interface A extends Ba, Nan { 
	public void fooD();
	public void fooD(int x);
}

public class Banana implements A {
	public void fooD() { System.out.println("Override");}
	public void fooD(int x) { System.out.println("Override");}

	public static void main (String[]args){
	Banana banana = new Banana();	
	banana.fooD();
	}
}
