import java.math.BigDecimal;

public class Change {
  public static void main(String args[]) {
    
   /* 
    * Not all decimals can be represented exactly using binary floating-point.
    */ 
    System.out.println(2.00 - 1.10);

    // Poor solution - still uses binary floating-point!
    System.out.printf("%.2f%n", 2.00 - 1.10);

    // Using integral type, such as float or long.
    System.out.println((200 - 110) + " cents");

    // Always use the BigDecimal(String) constructor, never BigDecimal(Double).
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
  }
}
