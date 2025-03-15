class base
{
         int a,b;
         public void inp()
         {
                a=10;
                b=20;
        }                
}
class derive extends base
{
        int c;
        public void prin()
        {
                c=a+b;
                System.out.println("Result : "+c);
        }
}
class singlein
{
        public static void main(String ar[])
        {
        derive c=new derive();
        c.inp();
        c.prin();
    }
}


