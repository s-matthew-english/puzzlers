public class Thrower {
  private static Throwable t;

  private Thrower() throws Throwable {
    throw t;
  }

  public static synchronized void sneakyThrow(Throwable t) throws Exception {
    Thrower.t = t;
    try {
      Thrower.class.newInstance();
    } catch (InstantiationException e) {
      throw new IllegalArgumentException();
    } catch (IllegalAccessException e) {
      throw new IllegalArgumentException();
    } finally {
      Thrower.t = null; // Avoid memory leak
    }
  }

  public static void main(String... args) {
    try {

      Thrower tx = new Thrower();
      
      t = new IllegalArgumentException();

      sneakyThrow(t);

    } catch (Exception e) {};
  }
}
