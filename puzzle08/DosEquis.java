/* The result of this puzzle lies in a "dark corner" of the conditional operator. 
 * Note that the types of the second and third operands are different from each other
 * in both of the conditional expressions: x is of type char, whereas 0 and i are both
 * of type int. Mixed-type computation can be confusing, nowhere is this more apparent
 * than in conditional expressions.
 */
public class DosEquis {
  public static void main(String[] args) {
    char x = 'X';
    int i = 0;
    // In this expression `PrintStream.print(char)` is invoked,
    // accordingly it overloading prints the value of the variable
    // `x` as a Unicode character (X)
    System.out.print(true ? x : 0);
    // In this expression `PrintStream.print(int)`, and prints the
    // variable `x` as a decimal integer (88) 
    System.out.print(false ? i : x);
   /* Generally it is best to use the same type for the second and
    * third operands in conditional expressions. 
    */

   char functional_x = 'X';
   // Putting the final modifier on the declaration here turns it into a constant expression
   final int functional_i = 0;
   System.out.print(true ? functional_x : 0);
   System.out.print(false ? functional_i : functional_x);
  }
}
