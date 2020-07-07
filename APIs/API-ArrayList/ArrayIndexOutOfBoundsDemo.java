class ArrayIndexOutOfBoundsDemo {
  public static void main (String args[]){
    int[] numbers = new int[10];

    try {
      numbers[10] = 3;
  } catch (Exception e) {
  System.out.println(e);}
  }
}
