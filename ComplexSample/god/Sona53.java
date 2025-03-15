class A
    {
       private int i;

       public int display(float f)
         {
            i=(int)f;
            return i;
         }
    }

public class Sona53 extends A
    {
         int j;
         float g;
       
         public Sona53()
            {
               A s=new A();
               //   XXXXX

              // what are legal in XXXXX
              
              j=i;
              g=f;
              j=s.display(3.2f);
              j=s.i;
              g=s.f;
           }

      public static void main(String[] args)
         {
             Sona53 ss=new Sona53();
         }
  }             
    
        