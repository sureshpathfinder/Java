import java.util.*;
import java.io.*;

public class excepM1
{
  public static void main(String args[])throws IOException
  {
      int a,b,c;
      /*Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();*/
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      a = Integer.parseInt(in.readLine());
      b = Integer.parseInt(in.readLine()); 
      c=a+b;
      System.out.println("Result ="+c);
    }
}
