import java.io.*;

// The buffering makes the program more than 20 times faster.
public class SumFile {

  public static void main(String[] a) throws IOException {
      sumfile("file.txt");
  }

  static void sumfile(String filename) throws IOException {
    Reader r = new BufferedReader(new FileReader(filename));
    StreamTokenizer stok = new StreamTokenizer(r);
    stok.parseNumbers();
    double sum = 0;
    stok.nextToken();
    while (stok.ttype != StreamTokenizer.TT_EOF) {
      if (stok.ttype == StreamTokenizer.TT_NUMBER)
        sum += stok.nval;
      else
        System.out.println("Nonnumber: " + stok.sval);
      stok.nextToken();
    }
    System.out.println("The file sum is " + sum);
  }

}
           