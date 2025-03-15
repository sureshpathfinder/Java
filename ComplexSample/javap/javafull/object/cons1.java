/*constructors hold the name of the class.
It will be invoked at the time of object creation.
It can be overloaded.
it has no return value.*/
class cons1
{
        cons1(int a, int b)//formal arguments
        {
                System.out.println("Added value="+(a+b));
        }
        public static void main(String ar[])
        {
           new cons1(100,100);//actual arguments
        
}
}
                

