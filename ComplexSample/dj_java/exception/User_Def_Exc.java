import java.util.Scanner;

class User_Def_Exc
{
  public static void main(String ar[])
  {
    Exception e=new Exception("U are not Eligible for voting");
    Scanner obj=new Scanner(System.in);
    int age=obj.nextInt();
    try
    {
      if(age<18)
      {
        throw(e);
      }
      else
      {
        System.out.println("U are Eligible for voting");
      }
    }
    catch(Exception ex)
    {
      System.out.println(ex);
    }
  }
}
       
    