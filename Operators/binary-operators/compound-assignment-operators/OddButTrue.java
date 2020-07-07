class OddButTrue {
	boolean isFalse = false;
	boolean odd = (isFalse = true);

	public static void main (String[]args){
		OddButTrue hmm = new OddButTrue();

		// Too true
		System.out.println(hmm.odd);
		System.out.println(hmm.isFalse);	
	}
}