public class EscapeRout {
  public static void main(String[] args) {
   /* Java provides no special treatment for Unicode escapes within string literals.
    * The compiler translates Unicode escapes into the characters they represent before
    * it parses the program into tokens, such as string literals. Therefore, the first
    * Unicode escape in the program closes a one-character string literal ("a"), and the
    * second one opens a one-character string literal ("b"). The program prints the value
    * of the expression "a".length() + "b".length(), or 2.
    */

    //\u0022 is the Unicode escape for double quote (")
    System.out.println("a\u0022.length() + \u0022b".length());

    System.out.println("a".length() + "b".length());

   /* More likely the author wanted to put the two double quote characters into the string literal.
    * You can't do this with Unicode escapes, but you can do it with *escape sequences*. If the Unicode
    * escapes in the original program are replaced with this escape sequence, it will print 16 as expected: 
    */
   System.out.println("a\".length() + \"b".length());

   /* Prefer escape sequences to Unicode escapes in string and character literals. Unicode escapes can be
    * confusing because they are processed so early in the compilation sequence. Do not use Unicode escapes
    * to represent ASCII characters.  
    */
  }
}
