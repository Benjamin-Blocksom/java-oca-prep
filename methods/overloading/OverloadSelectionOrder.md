# Order Selection Order

The order in which Java chooses which overloaded method to call.

| Rule | Example | 
| --------------------|---------------------------------------|
| Exact match by type | `public String doFoo(int i, int j) { }` |
| Largest primitive type | `public String doFoo (long i, long j) { }` |
| Autoboxed type | `public String doFoo (Integer i, Integer j) { }` |
| Varargs | `public String doFoo (int...nums) { }` |

