class ArrayStoreExceptionDemo {
  public static void main (String[] args){  
    String[] strings = { "stringValue" };
    Object[] objects = strings;
    try {
    objects[0] = new StringBuilder();
    System.out.println(objects);
} catch (Exception e) { 
  System.out.println("ArrayStoreException thrown." + 
		  " You don't actually have an object");}
}
}
