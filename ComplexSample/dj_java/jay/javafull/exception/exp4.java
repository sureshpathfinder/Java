//Multiple Catch Statement
class exp4
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
                catch(IndexOutOfBoundsException i)
                {
                        System.out.println("Index Karthik caught the exception : "+i);
                }
                catch(Exception e)
                {
                        System.out.println("System Karthik caught the exception : "+e);
                }

                System.out.println("After the try catch block");
        }
}
