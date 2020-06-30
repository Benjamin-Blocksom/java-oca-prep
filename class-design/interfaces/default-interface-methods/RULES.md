# Default Interface Methods
## RULES

A default interface methods: 

1. May only be declared within an interface. It is not declared in a class or abstract class.

2. Must be marked by the `default` keyword. If a method is marked as default, it must provide a method body.

3. Are not assumed to be static, final, or abstract. 

4. May be used or overridden by a class implementing the interface.

5. Will not compile if marked as `private` or `protected`. (Like all interface methods, it is assumed to be `public`.)


