# Defining an Interface
## RULES

An interface:

1. May not be directly instantiated.
2. Is not required to have any methods.
3. May not be marked as final. 
4. If top-level, has `public` or `default` access, and includes the `abstract` modifier in its definition. 
5. Has all its nondefault methods defined with `abstract` or `public` modifiers. 

Obs: Rule four means marking an interface as `private`, `protected`, or `final` will trigger a compiler error. 

Obs: Rule five means marking a method as `private`, `protected`, or `final` will trigger compiler errors.
