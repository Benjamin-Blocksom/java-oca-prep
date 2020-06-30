Did you know that the compiler will convert the first example into the second example?

```
public interface DoesFoo {
  void foo(int num);
  abstract void bar();
  public abstract double baz();
}
```


```
public abstract interface DoesFoo {
	public abstract void foo(int num);
	public abstract void bar();
	public abstract double baz();
}
```
