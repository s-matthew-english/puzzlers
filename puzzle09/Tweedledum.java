public class Tweedledum {
  public static void main (String[] args) {
    short x = 0;
    int i = 123456;
   
   /* Compound assignment expressions automatically cast the result 
    * of the computation they perform to the type of the variable on
    * their left-hand side.
    *
    * If the type of the result is wider than that of the variable,
    * the compound assignment operator performs a silent narrowing
    * primitive conversion. 
    */

    System.out.println("x: " + x); 
    System.out.println("i: " + i);

    x += i;     // Contains a hidden cast! 
    //x = x + i;  // Won't compile - "possible loss of precision"

    System.out.println("x: " + x); 
    System.out.println("i: " + i);
   /* To avoid unpleasant surprises, do not use compound assignment
    * operators on variables of type byte, short, or char.
    */
  }
}
