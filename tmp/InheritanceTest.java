class Dad { 
	public void dances() throws Exception {
	System.out.println("Dad dances the watusi.");
	}
}

class Son extends Dad { 
	public void dances (String dance) {
	System.out.println("Son dances the " + dance + ".");
	}
}

public class InheritanceTest {
public static void main (String[]args) throws Exception {
		Dad guy = new Son();
		guy.dances();
		Son son = (Son) guy;
		son.dances("fandango");
	}
}
