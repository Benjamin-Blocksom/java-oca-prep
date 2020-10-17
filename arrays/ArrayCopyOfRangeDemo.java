class ArrayCopyOfRangeDemo {
  public static void main (String[]args){
    char [] copyFrom = {'c', 'a', 'r', 'n', 'a', 'v', 'a', 'l'};

    char [] copyTo = java.util.Arrays.copyOfRange(copyFrom, 0, 3);

    System.out.println(copyTo);
  }
}
