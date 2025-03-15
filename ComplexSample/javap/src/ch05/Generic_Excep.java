public class Generic_Excep
{
           public static void main (String args[])
              {
               String str = "Exception" ;
               int len=0;
           try
              {
             StringBuffer sbuf = new StringBuffer(str);
            len = str.length() ;
           for(int ct=len;ct>=0;ct--)
            {
          System.out.print(sbuf.charAt(ct));
           }
       }
       catch(Exception e)
      {
      System.out.println("Error...."+e);
       }
     }
   }