/*Abstract class cannot be initiated. it cannot be declared as final. it will
have abstract method and ordinary methods.

Abstract method:-
it will not have a method body.*/

abstract class abstractclass
{
        abstract void display();
        
                void show()
                {
                        System.out.println("Inside Abstract class show method");
                }
}
class subclass extends abstractclass
{
        void display()
        {
                System.out.println("Abstract class overridden method");
        }

        void show()
        {
                System.out.println("Inside sub class show method");

        }

}


class abstract1
{

        public static void main(String ar[])
        {
                subclass t=new subclass();
                t.display();
                t.show();
         }
}



