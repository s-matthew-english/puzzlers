/**
 * Unicode escapes are essential when you need to insert characters that can't be represented 
 * in any other way into your program. Avoid them in all other cases. 
 */
public class StringCheese {
  public static void main(String[] args) throws Exception {
    byte[] bytes = new byte[256];
    for(int i = 0; i < 256; i++)
      bytes[i] = (byte)i;
   /**
    * "Construct a new String by decoding the specified `byte` array using the platform's default charset".
    *
    * What exactly is a `charset`?
    *
    * Technically, it is "the combination of a coded character set and a character-encoding scheme". In other
    * words, a charset is a bunch of characters, the numerical codes that represent them, and a way to translate 
    * back and forth between a sequence of character codes and a sequence of bytes.
    */
    String str = new String(bytes);
    for(int i = 0, n = str.length(); i < n; i++)
      System.out.print((int)str.charAt(i) + " ");

    System.out.println("\n" + java.nio.charset.Charset.defaultCharset());

    // When translating between `char` sequences and `byte` sequences, you can and usually should specify a charset explicitly.
    str = new String(bytes, "ISO-8859-1");
    for(int i = 0, n = str.length(); i < n; i++)
      System.out.print((int)str.charAt(i) + " ");
   /**
    * Every time you translate a `byte` sequence to a `String`, you are using a charset, whether you specify it explicitly or not.
    */ 
  }
}
