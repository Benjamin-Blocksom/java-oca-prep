Header
Date
--

### Loop Constructs: What can be inserted into this code to print 2345 when compiled and run?

```java
public class FlowTest {
    static int[] data = {1, 2, 3, 4, 5};

    public static void main (String [] args) {
        for (int i: data) {
            if (i < 2) {
                // insert code1 here
            }
            System.out.print(i);
            if (i==3) {
                // insert code2 here
            }
        }
    }
} 
```

A: You can use (1) `continue` and `//nothing further`; or (2) `continue` and `continue`.

Remember: 
The keyword `break` breaks the neares outer loop. Once you encounter `break`, the loop will not iterate further. 
The keyword `continue` starts the next iteration of the loop, ignoring the rest of the statements in the loop but starting the next iteration.

Keywords: `break`, `continue`

### Arrays: What will this code print when compiled and run?

```java
public class OrderTest {
    public void initData(String[] arr) {
        int ind = 0;
        for(String str : arr) {
            str.concat(str+" "+ind);
            ind++;
        }
    }

    public void printData(String[] arr) {
        for(String str: arr){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        OrderTest ot = new OrderTest();
        String[] arr = new String[2];
        ot.initData(arr);
        ot.printData(arr);
    }
}
```

A: It throws a `RuntimeException`. 

Remember: 
`new String[2]` creates a String array of two elements, it is therefore not `null`. But if the elements have not been assigned a value, they are `null`. So, calling methods on those elements will generate `NullPointerExeption`, a run time exception.

### Operators and Decision Constructs: What will this code print when run?

```java
public class TestClass {
    public static void main(String[] args) throws Exception {

        boolean flag = true;
        switch(flag) {
            case true: System.out.println("true);
            default: System.out.println("false");
        }
    }
}
```

A: It won't compile. Can't use a boolean for a switch statement.

Remember: 
1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. (String is allowed only since Java 7).
2. The case constants must be assignable to the switch variable. For example, if your switch variable is of class String, your case labels must use Strings as well.
3. The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535.
4.  All case labels should be COMPILE TIME CONSTANTS.
5. No two of the case constant expressions associated with a switch statement may have the same value.
6. At most one default label may be associated with the same switch statement.

### Java API (StringBuilder) - Which two statements are true about the `charAt()` method of `String` class?

A:
The `charAt()` method can take a char value as an argument.
The index of the first character is 0.

### Inheritance: What can be inserted at //1 and //2 in the following program?

```java
class Game {
    public void play() throws Exception {
        System.out.println("Playing...");
    }
}

class Soccer extends Game {
    public void play(String ball) {
        System.out.println("Playing Soccer with "+ball);
    }
}

public class TestClass {
    public static void main(String[] args) throws Exception {
        Game g = new Soccer();
        // 1
        Soccer s = (Soccer) g;
        // 2
    }
}
```

A: You can enter either of the following.
```java
g.play(); // enter at 1
s.play("cosco"); // enter at 2
```

```java
g.play() // enter at 1
s.play() // enter at 2
```

### What will the following code print?

```java
public class BreakTest {
    public static void main(String [] args) {
        int i = 0, j =5;
        lab1 : for( ; ; i++) {
            for( ; ;--j) if(i>j) break lab1;
        }
        System.out.println(" i = "+i+", j = "+j);
    }
}
```

A: `i = 0, j = -1`

### Lambda Expressions: Which of the following can invoke a method that accepts java.util.function.Predicate as an argument?

A:  `x -> System.out.println(x);` and `x->true`

Remember:
`Predicate` interface returns a boolean.
`Predicate` implementation must have a method taking exactly one parameter.

Keywords: `java.util.function.Predicate`

### Java API (Time and Date): Identify correct statement

A: `LocalDate`, `LocalTime`, `LocalDateTime` implement `TemporalAccessor`

Remember: 
1. Date/Time classes are in package java.time and have no relation to the old `java.util.Date` and `java.sql.Date`.

2. `java.time.temporal.TemporalAccessor` is the base interface that is implemented by `LocalDate`, `LocalTime`, and `LocalDateTime` concrete classes. This interface defines read-only access to temporal objects, such as a date, time, offset or some combination of these, which are represented by the interface `TemporalField`.

3. `LocalDate`, `LocalTime`, and `LocalDateTime` classes do not have any parent/child relationship among themselves. As their names imply, `LocalDate` contains just the date information and no time information, `LocalTime` contains only time and no date, while `LocalDateTime` contains date as well as time. None of them contains zone information. For that, you can use `ZonedDateTime`.

4. These classes are immutable and have no public constructors. You create objects of these classes using their static factory methods such as `of(...)` and `from(TemporalAccessor)`.  

For example:
`LocalDate ld = LocalDate.of(2015, Month.JANUARY, 1);` or `LocalDate ld = LocalDate.from(anotherDate);` or `LocalDateTime ldt = LocalDateTime.of(2015, Month.JANUARY, 1, 21, 10);` //9.10 PM

Since you can't modify them once created, if you want to create new object with some changes to the original, you can use the instance method named `with(...)`. For example:
`LocalDate sunday = ld.with(java.time.temporal.TemporalAdjusters.next(DayOfWeek.SUNDAY));`

5. Formatting of date objects into String and parsing of Strings into date objects is done by `java.time.format.DateTimeFormatter` class. This class provides public static references to readymade `DateTimeFormatter` objects through the fields named `ISO_DATE`, `ISO_LOCAL_DATE`, `ISO_LOCAL_DATE_TIME`, etc.  For example -
        
`LocalDate d1 = LocalDate.parse("2015-01-01", DateTimeFormatter.ISO_LOCAL_DATE);`

The parameter type and return type of the methods of `DateTimeFormatter` class is the base interface `TemporalAccessor` instead of concrete classes such as `LocalDate` or `LocalDateTime`. So you shouldn't directly cast the returned values to concrete classes like this -
  `LocalDate d2 = (LocalDate) DateTimeFormatter.ISO_LOCAL_DATE.parse("2015-01-01");` //will compile but may or may not throw a ClassCastException at runtime.
You should do like this -
   `LocalDate d2 = LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse("2015-01-01"));`

5. Besides dates, `java.time` package also provides Period and Duration classes. Period is used for quantity or amount of time in terms of years, months and days, while Duration is used for quantity or amount of time in terms of hour, minute, and seconds.

Durations and periods differ in their treatment of daylight savings time when added to `ZonedDateTime`. A Duration will add an exact number of seconds, thus a duration of one day is always exactly 24 hours. By contrast, a Period will add a conceptual day, trying to maintain the local time.

For example, consider adding a period of one day and a duration of one day to 18:00 on the evening before a daylight savings gap. The Period will add the conceptual day and result in a `ZonedDateTime` at 18:00 the following day. By contrast, the `Duration` will add exactly 24 hours, resulting in a `ZonedDateTime` at 19:00 the following day (assuming a one hour DST gap).

Did you even know there was such thing as a conceptual day? Well, there is.

### Java API: Which method calls can be applied to a String object?

A: `equals(Object)`, `equalsIgnoreCase(String)`, and `append()`.

Remember:
Calling `public String intern()` returns a canonical representation for the string object.

### Methods: What should the return type of FOO be for the following method?

```java
public FOO methodX (byte by) {
    double d = 10.0;
    return (long) by/d*3;
}
```

A: double
Observe: The cast `(long)` applies to `by`, not the whole expression.
