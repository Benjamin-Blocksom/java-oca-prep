public class SuperTricky {	
	public String holyMoly() {
		String holy = "";
		String moly = null;

		try {
			try {
				holy += "holy-";
				moly.length();
				holy += "cow";
			} catch (NullPointerException e) {
				holy += "moly, ";
				throw new RuntimeException();
			} finally {
				holy += " guaca";
			throw new Exception();
			}	
		} catch (Exception e) {
			holy += "mole!";
		}
		return holy;
		}

	public static void main (String[]args) {
		SuperTricky trick = new SuperTricky();
		System.out.println(trick.holyMoly());
	}
}
