# Test 3 : 2020-05-16

## Question 1/70

What would be the result of attempting to compile and run the following code?


// Filename: TestClass.java
public class TestClass{
   public static void main(String args[]){
      B c = new C();
      System.out.println(c.max(10, 20));
   }
}
class A{
   int max(int x, int y)  { if (x>y) return x; else return y; }
}
class B extends A{
  int max(int x, int y)  {  return 2 * super.max(x, y) ; }
}
class C extends B{
  int max(int x, int y)  {  return super.max( 2*x, 2*y); }
}

### (myAnswer, reason)

Code will not compile

I was thrown by the declaration `B c = new C();`

### (testAnswer, reason)

Code will compile and print 80 when run.

`c is declared as a type of B, but the actual object referenced is C`.

### Remember

In case of instance methods, the class of the actual object determines which version of a an overridden method to invoke.

## Question 2/70

What will be printed?

```java
public class ParamTest {

  public static void printSum(double a, double b){
      System.out.println("In double "+(a+b));
  }
  public static void printSum(float a, float b){
      System.out.println("In float "+(a+b));
  }

  public static void main(String[] args) {
      printSum(1.0, 2.0);
  }
}
```

## (myAnswer, reason)

"In float 3.0", "I am not sure what the difference between a float and a double is."

## (testAnswer, reason)

## Remember

An `int` will overload to a float before a double.
Both _float_ and _double_ can handle decimal points, but _double_ is more precise since it handles up to 15 decimal points.

## Constructors

The Java compiler automatically adds a constructor that takes no argument and has the same access as the class, if and only if the programmer does not define ANY constructor in the class.

## Wrapper Class

### Integer vs. int

Integer is a wrapper class than inherits from Object while `int` is a primitive data type. Integer helps convert `int` into an object and vice-versa. We can directly convert its value into other bases by using methods like `toBinary()`, `toOctalString()`, and `toHexString`.

## Handling Exceptions

Java's Exception Handling mechanism helps by (1) allowing creation of new exceptions customized to a particular domain (e.g. InsufficientFundsException for banking app) and (2) improving code becayse error handling code is separated from main logic.

## Java APIs - String, StringBuilder

String's equals() method (e.g. `foo.equals(bar)` checks string `foo` against string `bar`) checks the contents of the objects. Using the equality operand `==` (e.g. `foo == bar`) only checks if the two references are pointing to the same object or not.

 
