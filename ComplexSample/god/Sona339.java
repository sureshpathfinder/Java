 abstract class A
    {
        public void add()
          {
              System.out.println("A");
          }  
    }

 public class Sona339 extends A
   {
       public void add()
          {
              System.out.println("Sona338");
          }
  
    public static void main(String[] args)
        {
            A a = new Sona339();
            a.add();
        }
   }
 