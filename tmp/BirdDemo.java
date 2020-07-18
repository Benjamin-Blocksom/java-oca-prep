class Bird {
	public Object getBird(){return new Object();};
}

class Pheasant extends Bird {
	public String getBird(){return "Pheasant";};
}

public class BirdDemo {
	public static void main (String[]args) { 
		Bird larry = new Pheasant();
		System.out.println(larry.getBird());
	}	
}
