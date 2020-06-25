A child class method must:

1. Have same signature as parent class method.
2. Be at least as accessible (or more) than parent class method.
3. Never throw a checked exception that is broader or newer than any of those thrown in parent class method.


Finally: 

If method returns a value, it must be a covariant return type. 
E.g. the same or a subclass of the method in the parent class.)
