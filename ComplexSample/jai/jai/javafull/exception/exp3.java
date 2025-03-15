class exp3
{
        public static void main(String ar[])
        {
                try
                {
                          int arr[]=new int[-2];
                          System.out.println("First Element : "+arr[0]);
                }catch(NegativeArraySizeException n)
                {
                        System.out.println("Karthik caught the exception : "+n);
                }
                System.out.println("After the try catch block");
        }
}
