public class LinePrinter {
  public static void main(String[] args) {
  /**
   * The compiler translates Unicode escape characters before discarding comments.
   *
   * You can use `printf` instead of `println`, with the format string `"%n%n"`. 
   * Each occurrence of `%n` will cause `printf` to print the appropriate platform-
   * specific line separator.
   */
    char c = 0x000A;
    System.out.println(c);
    // Avoid Unicode escapes except where they are truly necessary. They are rarely necessary. 
  }
}
