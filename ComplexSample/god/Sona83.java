public class Sona83
  {
     static int total=10;

     public static void main(String[] args)
       {
           new Sona83();
       }

    public Sona83()
       {
           System.out.println(" In Sona83");
           System.out.println(this);
           
           int temp=this.total;
           if(temp>5)
             {
                 System.out.println(temp);
             }
     }
 }