public final class Sona170
  {

     class Inner
       {
          void test()
            {
               if(Sona170.this.flag)
                 {
                    sample();
                 }
            }
      }

    private boolean flag=true;
   
   public void sample()
      {
         System.out.println("sample");
      }
  
   public Sona170()
     {
        (new Inner()).test();
     }

   public static void main(String[] args)
     {
         new Sona170();
     }
  }    