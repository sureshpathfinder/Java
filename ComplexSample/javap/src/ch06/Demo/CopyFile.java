import java.io.*;

public class CopyFile {
  public static void main(String[] args) throws Exception {
    String fromFileName = "a.txt";
    String toFileName = "hi.txt";
    BufferedInputStream in = new BufferedInputStream(new FileInputStream(fromFileName));
    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(toFileName));
    byte[] buff = new byte[32 * 1024];
    int len;
    while ((len = in.read(buff)) > 0)
      out.write(buff, 0, len);
    in.close();
    out.close();
  }
}