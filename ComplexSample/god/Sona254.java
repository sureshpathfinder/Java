class A
{
   A()
   {
        System.out.println("class A");
   }
}

class B
{
   B()
   {
         System.out.println("class B");
   }
}

class Sona254 extends A
{  
   B b=new B();
  A a=new A();
  
  Sona254()
  {
    System.out.println("class Sona254");
  }

   
   public static void main(String ar[])
   { 
     Sona254 a1=new Sona254();
     System.out.println("hai");
    }
    
}