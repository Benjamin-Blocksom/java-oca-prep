How to Hide a Static Method

It's just like overriding a method, but with one additional rule: the `static` keyword must be the same between parent and child classes.

So...

1. Child class methods must have the same signature as parent class.
2. Child class method must be as accessible or more than parent class method.
3. Child class method may not throw a newer or broader checked exception than anything thrown in the parent class.
4. If method returns a value it must be a covariant return type. That is, it must be the same (or subclass) of method in parent class. 
5. Finally, static methods in the parent class must be marked as static in the child class. 
