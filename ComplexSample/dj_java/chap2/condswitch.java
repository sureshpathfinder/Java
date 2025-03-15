import java.io.*;
import java.util.*;
public class condswitch
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    switch(a)
    {
      case 1:
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      case 3:
        System.out.println("three");
        break;
      case 4:
        System.out.println("four");
        break;
      case 5:
        System.out.println("five");
        break;
      default:
        System.out.println("Enter number from 1 to 5");
    }
  }
}
   
                          