public class LongDivision {
  public static void main(String args[]) {
   /* 
    * The promotion from `int` to `long` is a widening primitive conversion,
    * which preserves the (incorrect) numerical value.
    *
    * Java does not have target typing, a language feature wherein the type
    * of the variable in which a result is to be stored influences the type
    * of the computation. 
    *
    * When working with large numbers, watch out for overflow- it's a silent
    * killer. 
    */

    // final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
    final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
    // final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
    final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;

    System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
  }
}
