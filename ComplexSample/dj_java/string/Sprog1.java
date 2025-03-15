import java.io.*;
class Sprog1
{
  public static void main(String args[])
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s="   Welcome to the world of JAVA   ";
    System.out.println(s);
    System.out.println(s.length());  /* To find the Length of the String */
    System.out.println(s.toUpperCase()); /* To UpperCase */
    System.out.println(s.toLowerCase()); /* To LowerCase */
    System.out.println(s.trim()); /* Remove the unwanted Spaces */
  }
}
