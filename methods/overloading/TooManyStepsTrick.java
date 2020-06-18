// Did you say wrapper class?

public class TooManyStepsTrick {
  public static void twoStep(Long l) { }
  public static void twoStep(Long...l) { }
  public static void main (String[]args) { 
  	twoStep(2);
	twoStep(2L);
  }
}
