public class AnimalFarm {
  public static void main (String[] args) {
    final String pig = "length: 10";
    final String dog = "length: " + pig.length();
   /* The `==` operator does not test whether two objects are equal, it tests whether
    * the two objects are *identical*. In other words, whether they refer to precisely
    * the same object.
    * 
    * Compile-time constants of type String are *interned*: 
    *
    * | Basically doing String.intern() on a series of strings will ensure that all strings 
    * | having same contents share same memory. So if you have list of names where 'john' 
    * | appears 1000 times, by interning you ensure only one 'john' is actually allocated memory.
    *
    * In other words, any two *constant expressions* of type `String` that designate the same
    * character sequence are represented by identical object references.
    */
    System.out.println("Animals are equal: " + pig == dog);

   /* The `+` operator, whether used for addition or string concatenation, binds more tightly
    * than the == operator. Therefore, the parameter of the `println` method is evaluated like so: 
    */
    System.out.println(("Animals are equal: " + pig) == dog);

    // When using the string concatenation operator, always parenthesize nontrivial operands.

    System.out.println("Animals are equal: " + (pig == dog));

    // Your code should rarely, if ever, depend on the interning of string constants. 

    // When comparing object references, you should use the `equals` method in preference to the == operator
    System.out.println("Animals are equal: " + pig.equals(dog));
  }
}
