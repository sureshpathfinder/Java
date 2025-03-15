import java.io.*;
class App_file
{
  public static void main(String ar[])throws IOException
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f1 = new File("hello.txt");
        FileWriter fwrite = new FileWriter(f1,true);
        BufferedWriter out = new BufferedWriter(fwrite);
        out.write(br.readLine());
        out.close();
  }
}