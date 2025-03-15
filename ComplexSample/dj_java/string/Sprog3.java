import java.io.*;
class Sprog3
{
  public static void main(String ar[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    String s1=br.readLine();

    if((s.startsWith("hai"))&&(s1.endsWith("end")))
    {
      System.out.println("ok");
    }
    System.out.println(s.substring(0,6));
    
  }
}