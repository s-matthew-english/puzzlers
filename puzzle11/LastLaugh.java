public class LastLaugh {
  public static void main(String[] args) {
    System.out.print("H" + "a");
   /* The problem is that `H` and `a` are char literals. Because neither operand is of
    * type `String`, the + operator performs addition rather than string concatenation.
    * The compiler evaluates the constant expression `H` + `a` by promoting each of the 
    * char-valued operands (`H` and `a`) to int values through a process known as *widening
    * primitive conversion*.
    */
    System.out.println('H' + 'a');

    // To concatenate characters you can use a library.
    StringBuffer sb = new StringBuffer();
    sb.append('H');
    sb.append('a');
    System.out.println(sb);

    // You can force the `+` operator to perform string concatenation rather than addition
    // by ensuring that at least one of the operands is a string.
    System.out.println("" + 'H' + 'a');
    System.out.println("2 + 2 = " + 2 + 2);

    // Using `printf`.
    System.out.printf("%c%c", 'H', 'a');

   /* The `+` operator performs string concatenation if and only if at least one of
    * its operands is of type String, otherwise it performs addition. 
    */
  }
}
