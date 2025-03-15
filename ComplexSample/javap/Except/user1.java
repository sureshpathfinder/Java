import java.util.*;
class user 
{
  public static void main(String args[])
  {
    int i;
    Scanner s=new Scanner(System.in);
    Exception e=new Exception();
    
    i=s.nextInt();
    try
    {
      
      if((i<0)||(i>100)) 
        throw (e);
      else
        System.out.println("hello i="+i);
    }
    catch(Exception n)
    {
      System.out.println("Error="+n);
    }
  }
}

