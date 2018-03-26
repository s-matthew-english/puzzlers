/* As its name implies, this program is supposed to swap the values of the variables
 * `x` and `y`.
 */
//public class CleverSwap {
public class SwapMeat {
  public static void main(String[] args) {
    int x = 1984; // (0x7c0)
    int y = 2001; // (0x7d1)
    // Attempts to swap variables without a temporary - Don't do this!
    x ^= y ^= x ^= y;
    System.out.println("x = " + x + "; y = " + y);

    x = 1984;
    y = 2001;
    // The actual behaviour of x ^= y ^= x ^= y in Java
    int tmp1 = x;     // First appearance of x in the expression
    int tmp2 = y;     // First appearance of y 
    int tmp3 = x ^ y; // Compute x ^ y
    x = tmp3;         // Last assignment: Store x ^ y in x
    y = tmp2 ^ tmp3;  // 2nd assignment: Store original x value in y
    x = tmp1 ^ y;     // First assignment: Store 0 in x
    System.out.println("x = " + x + "; y = " + y);

    x = 1984;
    y = 2001;
    // Rube Goldberg would approve, but don't ever do this!
    y = (x ^= (y ^= x)) ^ y;
    System.out.println("x = " + x + "; y = " + y);
   /* Do not assign to the same variable more  
    * than once in a single expression.
    */
  }
}
