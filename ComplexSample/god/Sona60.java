public class Sona60
   {
       public static void main(String[] args)
         {
            Float f1=new Float(0.9f);
            Float f2=new Float(0.9f);
            Double d1=new Double(0.9f);

           float  f = 0.9f;
           double d = 0.9;
          if(f == d) System.out.println("T1");
	else     System.out.println("F1");

            // which are legal
           f1==f2;
           f2==d;
           f1.equals(f2);
          f2.equals(f1);    
          if(f2.equals(d1)) System.out.println("T");
	else     System.out.println("F");
        
        }
  } 
 