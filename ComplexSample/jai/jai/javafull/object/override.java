/* Same name and return types and same arguments of methods
in different classes is called as overriding*/
class base
{
        int add(int a,int b)
        {
                return a+b;
        }
}
class derived extends base
{
/*        int add(int a,int b)
        {
                return a-b;
        }*/
}
class override
{
        public static void main(String ar[])
        {
                derived d=new derived();
                System.out.println(d.add(10,10));
        }
}


