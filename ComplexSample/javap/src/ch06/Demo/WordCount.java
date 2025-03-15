import java.io.FileReader;

class WordCount {
  public static void main(String args[]) throws Exception {
    int words = 0;
    int lines = 0;
    int chars = 0;

    FileReader fr = new FileReader("a.txt");
    int c = 0;
    boolean lastWhite = true;
    String whiteSpace = " \t\n\r";

    while ((c = fr.read()) != -1) {
      chars++;
      if (c == '\n') {
        lines++;
      }
      int index = whiteSpace.indexOf(c);
      if (index == -1) {
        if (lastWhite == true) {
          ++words;
        }
        lastWhite = false;
      } else {
        lastWhite = true;
      }
    }
    if (chars != 0) {
      ++lines;
    }
	System.out.println("Words : "+words+" Lines : "+lines+" Characters : "+chars);
  }
}
