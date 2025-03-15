//  execute like this :             java Sona190 h

 public class Sona190
    {
       public static void main(String[] args)
         {
            Integer i=Integer.intValue(args[args.length-1]);
            int l=i.valueOf(args.length);

            if(args.length>1)
              {
                 System.out.println("args.length>1");
              }

            if(args.length>0)
              {
                 System.out.println("True");
              }
           else
             {
                 System.out.println("False");
             }
         }
    }    