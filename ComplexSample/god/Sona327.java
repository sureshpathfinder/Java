class A
{
  public A()
  {
     System.out.println("class A");
  }
}

public class Sona327 extends A
{
   public Sona327()  
   {
          super();
          System.out.println("class Sona");
   }
   public static void main(String ar[])
   {
       Sona327 a=new Sona327();
   }
}