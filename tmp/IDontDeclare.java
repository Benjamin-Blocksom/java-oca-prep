public class IDontDeclare {
	public static void main(String[]args) {
		IDontDeclare iDontDo = new IDontDeclare();
		iDontDo.well();
	}

	public void well() {
		dontDeclare();
	}

	public void dontDeclare() { 
	 throw new Exception();
	} 
}