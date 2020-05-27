### Data Types: Does the following compile?

```
public class InitClass{
  public static void main(String args[]) {
    InitClass obj = new InitClass(5);
  }
  int m;
  static int i1 = 5;
  static int i2 ;
  int j = 100;
  int x;
  public InitClass(int m) {
    System.out.println(i1 + " " + i2 + " " + x + " " + j + " " + m);
   }
   { j = 30; i2 = 40; } // Instance Initializer
   static { i1++; } // Static Initializer
}
```

A: Code compiles without error and prints `6 40 0 30 5` when run.

Remember: Java variables fit into three scope categories. They are global-scope (instance variables), class-level(static variables), and block-level.
Keywords: instance variable shadowing, instance initializer, 

### Data Types: Assigning primitive long to string

The following three options work:

```
String myString = "123";
long m = new Long(myString); //auto-unboxing
```

```
String myString = "123";
long m = Long.parseLong(myString);
```

```
String myString = "123";
long m = Long.valueOf(myString).longValue(); 
// Long.valueOf(myString) returns object containing 123
// longValue() on a Long object will return the value contained in the wrapper class
```

Remember: Wrapper classes do not have no-args constructors.

### Inheritance - instanceof()

```
//Filename: TestClass.java
class TestClass {
  public static void main (String[] args) {
    A a = new A();
    B b = new B();
  };
}
class A implements T1, T2 { }
class B extends A implements T1 { }
interface T1 { }
interface T2 { }
```


