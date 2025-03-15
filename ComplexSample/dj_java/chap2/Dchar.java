import java.io.*;
class Dchar
{
  public static void main(String args[])throws IOException
  {
    char c;
    System.out.println("Enter x to know the Expansion for XML");
    c=(char)System.in.read();
    switch(c)
    {
    case 'x':
      System.out.println("EXtensible Mark-up Language");
      break;
    default:
      System.out.println("Enter the valid character");
    }
      
  }
}