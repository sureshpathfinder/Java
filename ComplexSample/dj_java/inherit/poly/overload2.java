class overload2
{
    overload2(int a)
    {
      System.out.println("Constructor "+a);
    }
    overload2(int a,int b)
    {
      System.out.println("Constructor "+(a+b));
    }
  public static void main(String args[])
  {
    overload2 ov=new overload2(1);
    overload2 ov1=new overload2(1,1);
  }
}
   
    