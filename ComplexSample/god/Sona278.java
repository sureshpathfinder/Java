class A
{
  A()
  {
        System.out.println("class B");
  }
}

class Sona278 extends A
{
  Sona278()
  {
       System.out.println("Class Sona278");
        Sona278 a2=new Sona278();
   }
   public static void main(String ar[])
   {
      Sona278 a1=new Sona278();
    }
 }