class first
{
        int a;
        void inp1()
        {
                a=10;
                System.out.println("First class a="+a);
        }
}
class second extends first
{
        int b;
        void inp2()
        {
                b=5;
                System.out.println("second class b="+b);
        }
}
class third extends second
{
        int c;
        void inp3()
        {
                c=a+b;
                System.out.println("Third class c="+c);
        }
}
class multilev
{
        public static void main(String ar[])
        {
                third t=new third();
                t.inp1();
                t.inp2();
                t.inp3();
        }
}



