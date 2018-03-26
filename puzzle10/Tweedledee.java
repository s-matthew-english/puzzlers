public class Tweedledee {
  public static void main(String[] args) {
   /* The += operator allows its right-hand operand to be of any type if the variable
    * on the left-hand side is of type String, in which case the operator performs 
    * String concatenation.
    */

   Object x = "Buy ";
   String i = "Effective Java!";

   x = x + i;

   System.out.println(x);

   //x += 1;
  /* The compound assignment is illegal because the left-hand side has an 
   * object reference type other than String.
   */
  }
}
