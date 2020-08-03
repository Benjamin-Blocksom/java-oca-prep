public class NoElseIf {

  public int smellSomethingFishy(int fish){
    int red = 2;
    int herring = 0;
    herring += red * fish;
    red = herring/red;
    if (herring < 48) {
    	return herring;
    }
    else {
    	herring = red * herring + 2;
	return herring;
    }
    else {
    	return herring/2;
    }
  
  }

  public static void main(String[]args) {
    NoElseIf trick = new NoElseIf();
    trick.smellSomethingFishy(42);
  }

}
