class exp2
{
        public static void main(String ar[])
        {
                try
                {
                          int i[]={2};
                          i[10]=20;
                }catch(IndexOutOfBoundsException ae)
                {
                        System.out.println("Karthik caught the exception : "+ae);
                }
                System.out.println("After the try catch block");
        }
}
