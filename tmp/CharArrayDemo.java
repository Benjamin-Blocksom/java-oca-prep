class CharArrayDemo {
  public static void main (String[]args) {
    char [] cA = new char[6];
    for (int i = 0; i < cA.length; i++) {
      System.out.print(cA[i] + " " );
    }
    System.out.println(char[0] == "\u000"); 
  }
}
