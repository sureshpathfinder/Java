/*Class which gives its properties to other class is called as super class
Class which gets the properties from other class is called as sub class*/

class Super
{
        int a,b;
        void disp()
        {
                a=10;
                b=10;
                System.out.println("Super A="+a);
                System.out.println("Super B="+b);
        }
}
class sub extends Super
{
        void show()
        {
                a=20;
                b=40;
                System.out.println("Sub A="+a);
                System.out.println("Sub B="+b);
        }
}
class supsub
{
        public static void main(String ar[])
        {
                sub s=new sub();
                s.disp();
                s.show();
        }
}



