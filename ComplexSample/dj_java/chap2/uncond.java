import java.io.*;
import java.util.*;
public class uncond
{
  public static void main(String args[])
  {
    System.out.println("For break");
    for(int a=0;a<=5;a++)
    {
      if(a==3)
        break;
      System.out.println(a);
    }
    System.out.println("For continue ");
    for(int b=5;b>0;b--)
    {
      if(b==2)
        continue;
      System.out.println(b);
    }
    
  }
}
