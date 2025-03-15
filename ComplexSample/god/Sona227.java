  public class Sona227
     {
          public class B
             {
                public void act()
                  {
                     System.out.println("act - B");
                  }
            }

      public static void main(String[] args)
        {
           Sona227.B a=new Sona227().new B();
           a.act();
        }
    }  