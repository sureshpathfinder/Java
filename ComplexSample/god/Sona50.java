public class Sona50
    {
       public static void main(String[] args)
         {
             String s = null;
            // which of the following will not throw NullPointerException

     //   if((s!=null) & (s.length()>0)) 
          if((s!=null) && (s.length()>0)) 
        if((s==null) || (s.length()==0))  System.out.println("T2");               

     //  if((s==null) | (s.length()==0)) System.out.println("T1");
    }
 }