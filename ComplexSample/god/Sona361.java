class AA
  {
    public void act()
      {
         System.out.println("aaaaa");
      }
 }

 public class Sona361 extends AA 
   {
     public void act()
      {
         System.out.println("bbbbbbb");
      }
     
     public static void main(String args[])
      {
         AA a = new Sona361();
        a = new AA();
     }
  }