class GoSeek { 
	int booty = 0;
	public int getBooty() {
		System.out.println("Go Seek " + booty);
		return booty;
	}
}

public class HideAndGoSeek extends GoSeek { 
	int booty = 1;

	public int getBooty() {
		System.out.println("Hide " + booty);
		return booty;
	}

	public static void main (String[]args){
		GoSeek seek = new HideAndGoSeek();
		System.out.println(seek.booty + " " + seek.getBooty());
		HideAndGoSeek hide = new HideAndGoSeek();
		System.out.println(hide.booty + " " + hide.getBooty());
	}

}