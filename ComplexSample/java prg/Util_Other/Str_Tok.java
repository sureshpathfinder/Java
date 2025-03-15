import java.io.*;
import java.util.*;

public class Str_Tok
{
  public static void main ( String[] args ) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a string:");
    String s = br.readLine();
    System.out.println(s);
    StringTokenizer t = new StringTokenizer(s);
    while ( t.hasMoreTokens() )
    {
      System.out.println( t.nextToken() );
    }
  }
}