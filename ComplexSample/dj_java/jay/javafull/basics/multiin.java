class base1
{
         int a;
         public void inp1()
         {
                a=10;
        }                
}
class base2 extends base1
{
         int b;
         public void inp2()
         {
                b=10;
        }                
}

class derive extends base2
{
        int c;
        public void prin()
        {
                c=a+b;
                System.out.println("Result : "+c);
        }
}
class multiin
{
        public static void main(String ar[])
        {
        derive c=new derive();
        c.inp1();
        c.inp2();

        c.prin();
    }
}


