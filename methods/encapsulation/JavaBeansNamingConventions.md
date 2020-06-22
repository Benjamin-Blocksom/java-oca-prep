| Rule                   | Example                                    | 
|------------------------|--------------------------------------------|
| Properties are private | `private int numApples;`|
| Getter methods begin with `is` if the property is a boolean. | `public boolean isApple() { return apple; }` |
| Getter methods begin with `get` if the property is not a boolean. | `public int getApples() { return numApples;}` | 
| Setter methods begin with set |  `public void setApples(boolean apple){ this.apple = apple;}`| 
| Method name must have prefix of `set-`, `get-`, or `is-`, followed by first letter of property in uppercase, then rest of property name. | `public void setApples(int num) { this numApples = num;}`|  
