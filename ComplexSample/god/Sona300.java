public class Sona300
{
    public static void main(String argv[])
    { 
        Sona300 c=new Sona300(); 
        String s=new String("ello"); 
        c.amethod(s); 
    } 
   public void amethod(String s)
   { 
     char c='H'; 
     c+=s; 
     System.out.println(c); 
   } 
}

