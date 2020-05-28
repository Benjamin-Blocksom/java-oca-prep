### Inheritance: Given interface below, which two other definitions are valid?

```
interface I1 {
    void setValue(String s);
    String getValue();
}
```

Remember: 
Classes do not `extend` interfaces; they `implement` interfaces.
Interfaces do not `implement` anything; they can extend multiple `interfaces`.

Keywords: `analyse`

### Exceptions: What will this print?

```
public class TestClass{
  public static void main(String[] args){
     int x = 1;
     int y = 0;
     if( x/y ) System.out.println("Good");
     else  System.out.println("Bad");
  }
}
```

Answer: Nothing, it will not compile.

Remember: You need a boolean in the `if` condition. Since the compiler sees x/y cannot produce a boolean it generates a compile time error.

### Inheritance: What will this code print when run?

```java
class A {
}

class AA extends A {
}

public class TestClass {
    public static void main(String[] args) throws Exception {
        A a = new A();
        AA aa = new AA();
        a = aa;
        System.out.println("a = " + a.getClass());
        System.out.println("aa = " + aa.getClass());
    }
}
```

Answer: 
``` 
a = class AA
aa = class AA
```

Remember: 
`getClass` is a public instance method in `Object` class, meaning it is polymorphic.
Polymorphic methods are bound at run time. 
Keywords: `polymorphism`, `public instance method`, `getClass`

### Java API (Time and Date): What will the following line of code print?

```java
System.out.println(LocalDate.of(2015, Month.January, 01).format(DateTimeFormatter.ISO_DATE_TIME));
```

_A_: Exception at run time.

Remember:
`LocalDate` does not have a time component, unlike `LocalDateTime`. Thus, you cannot format it with a formatter that expects time components like `DateTimeFormatter.ISO_DATE_TIME`. You would need to do this with `DateTimeFormatter.ISO_DATE`.

### Methods: What will the following output when run?

```java
public class TestClass {
    char c;
    public void m1() {
        char [] cA = { 'a', 'b'};
        m2(c, cA);
        System.out.println(((int)c) + "," + cA[1]);
    }
    public void m2(char c, char[] cA) {
        c = 'b';
        cA[1] = cA[0] = 'm';
    }
    public static void main(String args[]) {
        new TestClass().m1();
    }
}
```

A: `0,m`
Remember: Because of the explicit cast to `int` in the `print()` call, `c` prints as `0`.
Arrays are Objects, so `cA` changes done in `m2()` are global.
The passed-in parameter `c` is different from the local instance variable `c` which shadows it. In other words, `c` is only `b` for the scope of method `m2`. When it is called again in the `println` of `m1` it takes its global value, which in this case is 0.
Keywords: `shadow instance variables`, `pass-by-value`

### Data Types: What happens when compiling the following with the command line `java TestClass 1 2`?

```java
public class TestClass{
    public static void main(String[] args) {
        int i = Integer.parseInt(args[1]);
        System.out.println(args[i]);
    }
}
```

A: It throws `ArrayIndexOutOfBoundsException`.
Remember:
The name of the class is not the first element of `args`.
Arrays are indexed from 0.

### Arrays: What is the result of compiling and running the following?

```java 
public class TestClass{
    public static void main(String args[]) {
        int i = 0;
        int [] iA = { 10, 20} ;
        iA[i] = i = 30;
        System.out.println("" = iA[ 0 ] + iA [ 1 ] + " " + i)'
    }
}
```

A: It prints `30 20 30`.
Remember: 
JLS evaluates as follows:
    1. Evaluate Left-Hand Operand First
    2. Evaluate Operands before Operation
    3. Evaluation respects Parentheses and Precedence
    4. Argument Lists are Evaluated left-to-right.
    5. For Arrays, dimension expressions are evaluated left-to-right. 
    6. If an array evaluation completes abruptly, expressions to the right are not evaluated.

### Basics: What does this print when compiled and run?

```java
public class ATest {
    String global = "111";

    public int pares(String arg){
        int value = 0;
        try {
            String global = arg;
            value = Integer.parseInt(global);
        }
        catch(Exception e) {
            System.out.println(e.getClass());
        }
        System.out.print(global + " " + value + " ");
        return value;
    }
    
    public static void main(String [] args) {
        ATest ct = new Atest();
        System.out.print(ct.parse("333));
    }
}
```

A: `111 333 333`
Remember: 
If you throw a string that cannot be parsed into an `int` using `parseInt` method, it throws `java.lang.NumberFormatException`.
Keywords: `parsInt`, `shadow variable`

### Operators and Decision Constructs: Choose fragments that will print the last argument given at command line and exit without any output or stack trace if no argument is given:

Three options that work:

```java
public static void main(String args[]) {
    if (args.length != 0) System.out.println(args[args.length-1]);
}
```

```java
public static void main(String args[]) {
    try { System.out.println(args[args.length-1])};
    catch (ArrayIndexOutOfBoundsException e) { }
}
```

```java
public static void main(String args[]) {
    int i = args.length;
    if (i != 0) System.out.println(args[i-1]);
}
```

Remember:
If no argument is given, a String array of length zero is received in the main method.

### Methods(overloading): What is printed in the following class?

```java
public class ParamTest {

    public static void printSum(double a, double b){
        System.out.println("In double " + (a + b));
    }
    public static void printSum(float a, float b){
        System.out.println("In float "+(a+b));
    }
    public static void main(String[] args) {
        printSum(1.0, 2.0);
    }
}
```

A: In double 3.0
Remember:
A float is closer than a double to an int. Check it out for yourself. The exam has questions on this pattern. 
