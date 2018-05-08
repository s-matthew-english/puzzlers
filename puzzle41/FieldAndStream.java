import java.io.*;

public class FieldAndStream {
  public static void main(String... args) throws IOException {

    copy("./test0.txt", "./test1.txt");

  }

  static void copy(String src, String dest) throws IOException {
    InputStream in = null;
    OutputStream out = null;
    try {
      in = new FileInputStream(src);
      out = new FileOutputStream(dest);
      byte[] buf = new byte[1024];
      int n;
      while ((n = in.read(buf)) >= 0)
        out.write(buf, 0, n);
    } finally {
      if (in != null) in.close();
      if (out != null) out.close();
    }
  }
}
