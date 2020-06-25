1. Child class method must have same signature as parent class method.
2. Child class method must be at least as accessible (or more) than parent class method.
3. Child class method may not throw newer or broader checked exception than any of those thrown in parent class method.
4. If method returns a value, it must be a covariant return type. (E.g. the same or a subclass of the method in the parent class.)
