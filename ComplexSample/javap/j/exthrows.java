
class exthrows
{
 public static void main(String arg[]) throws ArithmeticException
 {
 
 
 try{
  System.out.println("inside mymethod");
  int n=0;
  int j=12/n;
  System.out.println("not printed"); 
 } 
 catch(ArithmeticException e)
 {
  System.out.println(e);
 }
 }
}
