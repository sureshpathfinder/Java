class userexcep
{
  public userexcep(int a)throws MyException
  {
    System.out.println("Called a=" + a);
    if(a > 10)
      throw new MyException(a);
    System.out.println("Normal exit");
  }
  public static void main(String args[])
  {
    try
    {
      userexcep u=new userexcep(1);
      userexcep u1=new userexcep(20);
    }
    catch (MyException e)
    {
      System.out.println("Caught " + e);
    }
  }
}

//User Defined Exception
class MyException extends Exception
{
private int detail;
MyException(int a) 
{
detail = a;
}
public String toString()
{
return "MyException " + detail;
}
}
