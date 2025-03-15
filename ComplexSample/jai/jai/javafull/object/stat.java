/*
when a member is declared as static, it can be accesed before any object of
its class.
Berore main class static block  is executed.
Variables and methods only can be declared as static.
static property of a class can be access through class name
 Static methods can call only other static methods and access only static data*/

 class stat
 {
        static int a=3;
        static int b;
        static int r=8;

        static void meth(int x)
        {
                System.out.println("X="+x);
                System.out.println("a="+a);
                System.out.println("b="+b);
        }

        static
        {
                System.out.println("Static block initialized");
                b=a*4;
        }

        public static void main(String ar[])
        {
                meth(42);
                System.out.println("r="+stat.r);

        }
}
                


