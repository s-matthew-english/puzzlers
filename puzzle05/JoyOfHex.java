public class JoyOfHex {
  public static void main(String[] args) {
    System.out.println(
      //Long.toHexString(0x00000000L + 0xcafebabe));
      /* Negative decimal constants are clearly identifiable by the presence  
       * of a minus sign. Hex and octal literals are negative if their high-order
       * bit is set. 
       * 
       * The addition performed by the program is a mixed-type computation: The
       * left operand is of type `long`, and the right operand is of type `int`.
       * to perform the computation, Java promotes the `int` value to a `long` 
       * with a widening primitive conversion and adds the two `long` values.
       * Because `int` is a signed integral type, the conversion performs sign 
       * extension: It promotes the negative `int` value to a numerically equal
       * `long` value. 
       */
      Long.toHexString(0x00000000L + 0xcafebabeL));
  }
}
