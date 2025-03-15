import java.io.*;

class BRFileReaderDemo {
  public static void main(String args[]) throws IOException {
    FileReader fr = new FileReader("BRFileReaderDemo.java");
    BufferedReader br = new BufferedReader(fr);
    String s;
int i=0;
    while ((s = br.readLine()) != null) {
      System.out.println(s);i++;
    }
System.out.println(i);
    fr.close();
  }
}
