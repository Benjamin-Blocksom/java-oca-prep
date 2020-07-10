// When using equality operator (==), 
// If one operand is a Boolean wrapper it is unboxed to a boolean primitive
// and then compared.
// If both are wrappers, their references are compared (just like any other objcet). 

class BooleanWrapper {
  public static void main (String[]args){
  	System.out.println(new Boolean("true") == new Boolean("true"));
	System.out.println(new Boolean("true") == Boolean.parseBoolean("true"));
  	}
}
