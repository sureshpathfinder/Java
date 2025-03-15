class class2
{
        void display()
        {
                System.out.println("This is inside display method");
        }
        int add(int a, int b)
        {
                return a+b;
        }
        public static void main(String ar[])
        {
                class2 k=new class2();
                k.display();
                System.out.println(k.add(10,10));
         }
}
