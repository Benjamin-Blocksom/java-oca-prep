cd .public class DifferentFolks {
	private int folks;
	void seeFolks(){
		while(folks<=5){
		for(int folks=1; folks<=3;){
			System.out.print(folks + " ");
			folks++;
			}
		folks++;
		}

	}
	public static void main (String[]args) {
		new DifferentFolks().seeFolks();
	}
}
