class elseif
{
        public static void main(String ar[])
        {
                char a;
                a='z';
                if(a<0)
                {
                        System.out.println("No Such Ascii Values");
                }
                   
                else if(a>64 && a<91)
                {
                        System.out.println("Upper Case Letter");
                }
                else if(a>96 && a<123)
                {
                        System.out.println("Lower Case Letter");
                }
                else
                {
                        System.out.println("Invalid Input");
                }
         }
}



