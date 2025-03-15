
public class Sona20
{
     public static void main(String args[])
       {
	try{
	        int a = 10/0;
	     }
	catch(ArithmeticException e)
	        {
		System.out.println("Error");
		System.exit(0);		
	        }
	finally{
		System.out.println("FINALLY");
	          }		
      }	
}