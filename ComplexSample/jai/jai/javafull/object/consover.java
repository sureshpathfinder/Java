class consover
{
        int a,b;
        consover()
        {
                a=100;
                b=200;
                System.out.println(a+b);
         }
        consover(int a)
        {
                b=200;
                System.out.println(a+b);
         }
        consover(int a,int b)
        {
                System.out.println(a+b);
         }
         public static void main(String ar[])
         {
                new consover();
                new consover(200);
                new consover(200,200);
         }
}

         
