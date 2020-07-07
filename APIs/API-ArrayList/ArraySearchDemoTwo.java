import java.util.*;

class ArraySearchDemoTwo {
  public static void main (String [] args) {
  int [] numbers = {3,2,1};
  System.out.println(Arrays.binarySearch(numbers, 1));
  System.out.println(Arrays.binarySearch(numbers, 2));
  System.out.println(Arrays.binarySearch(numbers, 3));
  System.out.println(Arrays.binarySearch(numbers, 4));
  }
}
