/*
Throw
 So far we saw only been catching exceptions that are thrown by the java at runtime.  However it is possible to thow an exception explicitly ie by the user itself.
*/

import java.util.*;
class thr
{

 public static void main(String args[])
 {
   Scanner s=new Scanner(System.in);
  try
  {
    int a=s.nextInt();
    System.out.println(a);
   // throw new NumberFormatException();
  }
  
  catch(NumberFormatException e)
  {
   System.out.println(e);
  }
 }
}

 