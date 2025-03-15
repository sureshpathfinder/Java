/* If a method is capable of causing an exception that it does not handle.  It must specify the behaviour so that callers of the method can gurad themselves against this exception.  It list the type of exception that a method might throw.
*/


class Throws1{
	public static void main(String args[]) throws ArithmeticException{
		int a=0;
		int b=10/a;
             System.out.println("this line will not be printed");
	}
}