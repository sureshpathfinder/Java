/* overloading is nothing but the same name of methods with different
arguments in same class*/
class overload
{
        int a,b;
        int add()
        {
                a=100;
                b=200;
                return a+b;
         }
        int add(int a)
        {
                b=200;
                return a+b;
         }
         int add(int a,int b)
         {
                return a+b;
         }
         public static void main(String ar[])
         {
                overload k=new overload();
                System.out.println(k.add());
                System.out.println(k.add(20));
                System.out.println(k.add(331,31));
         }
}


