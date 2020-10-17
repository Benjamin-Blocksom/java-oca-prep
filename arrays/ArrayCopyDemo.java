class ArrayCopyDemo {
  public static void main (String[]args) {
  char[] copyFrom = { 'l', 'o', 'n', 'g', 'e', 'r' };
  char[] copyTo = new char[4];

  System.arraycopy(copyFrom, 0, copyTo, 0, 4);
  System.out.println(copyTo);
  }
}
