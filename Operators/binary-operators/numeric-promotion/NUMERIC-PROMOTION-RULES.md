### Numeric Promotion Rules

1. If two values have different data types, Java will automatically promote one of the values to the larger of the two. 
2. If one of the values is integral and the other is floating-point, Java will automatically promote the integral values to the floating-point value's data type.
3. Smaller data types (`byte`, `short`, `char`) are first promoted to `int` anytime they are used with a binary arithmetic operator, even if neither are `int`.
4. After all promotion is complete, the resulting value will have the same data type as its promoted operands.

