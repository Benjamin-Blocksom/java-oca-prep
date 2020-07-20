public class IDoDeclare {
	public static void main(String[]args) throws Exception {
		IDoDeclare iDo = new IDoDeclare();
		iDo.well();
	}

	public void well() throws Exception {
		doDeclare();
	}

	public void doDeclare() throws Exception { 
	 throw new Exception();
	} 
}