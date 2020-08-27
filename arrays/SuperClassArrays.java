// Should throw a ClassCastException at line 12
// because the actual object is not an array of B
// but an array of A.

public class SuperClassArrays {
  public static void main (String...args){
    A[ ] a, a1;
    B[ ] b;
    a = new A[10]; a1 = a;
    b = new B[20];
    a = b;
    b = (B[]) a;
    b = (B[]) a1;

  }

}

class A { }

class B extends A { }
