// Demonstrate multiple catch statements.
/*
try
   {
     stmt;
    }catch(Exception){}

   }catch(Exception) {}

*/
class ThrowsEx {
  public static void main(String args[]) throws Exception{
    
      int a = 4;
      System.out.println("a = " + a);
      int b = 42 / a;
      int c[] = { 1 };
      c[42] = 99;
        System.out.println("After try/catch blocks.");
  }
}
