public class FallThroughTrick {
	public void noBreakForYou(String s){
		switch(s) {
			case "world": System.out.print("The world ");
			case "World" : System.out.print("sits ");
			case "elephants" : System.out.println("on the backs of Elephants ");
			case "Turtles" : System.out.println("that are sitting on turtles");
			case "turtles" : System.out.println("that are sitting on turtles");
			case "gimme a Break!" : System.out.println("that are sitting on turtles");
			case "Gimme a Break!": System.out.println("that are sitting on turtles");
		
		}
			
	}


	public static void main (String[]args){
		FallThroughTrick trick = new FallThroughTrick();
		trick.noBreakForYou("world");
	}
}
