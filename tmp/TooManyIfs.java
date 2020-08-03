// This is the dangling else problem.

class TooManyIfs {
	public static void main (String[]args) {
		if (args[0].equals("Trick")) 
		    if (args[1].equals("Treat"))
		        System.out.println("Here kid. Have some candy");
			else System.out.println("Buzz off, it's June.");
	}
}