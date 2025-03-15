import java.io.*;
public class buffer
{
  public static void main(String args[])throws IOException
  {
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    String str=obj.readLine();
    String str1=obj.readLine();
    int a=Integer.parseInt(str);
    float b=Float.parseFloat(str1);
    System.out.println("Result :"+(a+b));
  }
}