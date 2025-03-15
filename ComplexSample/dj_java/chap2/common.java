import java.io.PrintStream;
public class common
{
  public static void main(String args[])
  {
    System.out.println("Hello...!");
    PrintStream k=new PrintStream(System.out);
    k.print("Welcome to JAVA");
    k.print(" and J2E"); 
  }
}