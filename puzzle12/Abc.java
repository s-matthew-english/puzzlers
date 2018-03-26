public class Abc {

  int var;

  public Abc(int var) {
    this.var = var;
  }

  public static void main(String[] args) {
    Abc first = new Abc(3);
    Abc second = new Abc(4);
    Abc third = new Abc(4);

    String letters = "ABC";

   /* Although `char` is an internal type, many libraries treat it specially, because
    * `char` values usually represent characters rather than integers. For example, passing
    * a `char` to `println` prints a Unicode character rather than its numerical code. 
    * Character arrays get similar treatment: The `char[]` overloading of `println` prints
    * all of the characters contained in the array... The string concatenation operator 
    * however is not defined in terms of these methods. 
    */
    char[] numbers = {'1', '2', '3'};
    System.out.println(letters + " easy as " + numbers);

    System.out.println(first);
    System.out.println(second);
    System.out.println(third);


    System.out.println(letters + " easy as " + String.valueOf(numbers));

    System.out.print(letters + " easy as ");
    System.out.print(numbers);
    System.out.print("\n");

    Object numbersObject = new char[] { '1', '2', '3'};
    System.out.print(letters + " easy as ");
    System.out.print(numbersObject);

  }

  @Override 
  public int hashCode() {
    return var;
  }
}
