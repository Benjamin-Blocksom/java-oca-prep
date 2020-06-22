// Initialization order:
// 1. Superclass (if none go to next)
// 2. Static variable declarations and static initializers in the order they appear.

// AND, if and when a class is called to:

// 3. Instance variable declarations and instance initializers in the order they appear.
// 4. The constructor.



public class InitializationOrder {
  private String name = "instance variable";
  {System.out.println(name);}
  private static int COUNT = 0;
  static { System.out.println(COUNT); }
  static { COUNT += 100; System.out.println(COUNT); }
  public InitializationOrder()	{
	System.out.println("constructor");}}

