public class Sona86
  {
     public static void main(String[] args)
       { 
          int a = 5;
          Loop:
             for(int i=1;i<3;i++)
               {
                  for(int j=1;j<3;j++)
                    {
                        if(a==5)
                          {
                             break Loop;
                          }
                         System.out.println(i*j);
                   }
              }
       
      }     
}  