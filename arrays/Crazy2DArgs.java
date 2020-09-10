// Run with: java Crazy2DArgs 1 2 3

public class Crazy2DArgs {
  public static void main(String[][] args) {
  	System.out.println(args[0][1]);
  	}
  public static void main(String[] args) {
  	Crazy2DArgs crazyArgs = new Crazy2DArgs();
	String[][] moreCrazy = {args};
	crazyArgs.main(moreCrazy);
  	}	
}

