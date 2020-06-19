# Overloading

Overloading happens when methods with same name but different signatures and type parameters. Overloading also allows for a different amount of parameters. Overloaded methods can have different access modifiers, specifiers (static, abstract, final), return types and exceptions.

These are valid:

public void foo(int bar) { }  
public void foo(short qux) {  }    
public boolean foo() { return true; }  
void foo(int quux, short qux) { }   
public void foo(short qux, int bar) throws Exception { }  


