public class Fools {
	private int yearsTreatedBadly;
	private String whatFatherSaid;
	private String whatDoctorSaid;

	public Fools (int yearsTreatedBadly){
		this(yearsTreatedBadly, "Come on home");
	}

	public Fools (int yearsTreatedBadly, String whatFatherSaid) {
		this(yearsTreatedBadly, 
		whatFatherSaid, "Take it easy"); 
	}

	public Fools (int yearsTreatedBadly, String whatFatherSaid, String whatDoctorSaid) {
		this.yearsTreatedBadly = yearsTreatedBadly;
		this.whatFatherSaid = whatFatherSaid;
	        this.whatDoctorSaid = whatDoctorSaid;
	}

	public void testify() {
		System.out.println("For " + yearsTreatedBadly 
				+ " long years I thought you were my man..." );
		System.out.println("..." + "My father said '" + whatFatherSaid + "'");
		System.out.println("My doctor said '" + whatDoctorSaid + "'...");
		
	}

	public static void main (String[]args) {
		Fools fool = new Fools(5);
		fool.testify();
	}
}
