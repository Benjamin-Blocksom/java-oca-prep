import java.util.Arrays;

class SortArrayDemo {
  public static void main (String [] args) {
    int[] foo = { 5, 57, 2};
    Arrays.sort(foo);
    for (int i = 0; i < foo.length; i++) {
      System.out.println(foo[i]);
    };
  }
}
