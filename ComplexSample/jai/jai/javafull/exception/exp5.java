//try-catch-finally
class exp5
{
        public static void main(String ar[])
        {
                try
                {
                          int arr[]=new int[-2];
                          System.out.println("First Element : "+arr[0]);
                }catch(ArithmeticException a)
                {
                        System.out.println("Arithmetic Karthik caught the exception : "+a);
                }
                finally
                {
                        System.out.println("===============================");
                        System.out.println(" Final clause will be exceuted ");
                        System.out.println(" either succesful caught or    ");
                        System.out.println(" unsuccessful condition        ");
                        System.out.println("===============================");
                 }
                System.out.println("After the try catch finally  block");
          }
                
}
