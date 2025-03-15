import java.util.*;

public class array2
{
  public static void main(String args[])
  {
    int i;
    int[] a=new int[5];   // Another way to declare an Array
    
    Scanner s=new Scanner(System.in);
    System.out.println("Length of an array:" +a.length);
    for(i=0;i<5;i++)
    {
      a[i]=s.nextInt();
    }
    System.out.println("Result of  an array's");
    for(i=0;i<5;i++)
    {
      System.out.println(a[i]);
    }
  }
}