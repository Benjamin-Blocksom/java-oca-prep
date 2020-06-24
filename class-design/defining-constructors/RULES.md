# Rules for Defining Constructors

1. The first statement of every constructor is a call to another constructor within the class using `this()`, or a call to a constructor in the direct parent class using `super()`.
2. The `super()` call cannot be used after the first constructor statement.
3. If `super()` is not declared in the constructor, Java will insert a no-argumnet call to `super()` as the constructor's first statement.
4. If the parent does not have a no-argument constructor and the child does not define any constructors, the compiler will throw an error and try to insert a no-argument constructor into the child class.
5. If the parent does not have a no-argument constructor, the compiler requires an explicit call to a parent constructor in each child constructor.
