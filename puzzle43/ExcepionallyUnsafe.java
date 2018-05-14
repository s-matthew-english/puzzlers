public class ExcepionallyUnsafe {

  public static void main(String... args) {
    sneakyThrow(new IllegalArgumentException());
  }

  public static void sneakyThrow(Throwable t) {
    Thread.currentThread().stop(t);
  }
}
