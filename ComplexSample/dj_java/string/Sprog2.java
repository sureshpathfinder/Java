import java.io.*;

class Sprog2
{
  public static void main(String ar[])throws IOException
  {
    char c[]={'H','E','L','L','O'};
    String c1=new String(c);
    System.out.println(c1);
    System.out.println(c1.charAt(4));
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    String s1=br.readLine();
    if(s.equalsIgnoreCase(s1))
    {
      System.out.println("Strings are Equal");
    }
    else
    {
      System.out.println("Strings are Not Equal");
    }
     
  }
}