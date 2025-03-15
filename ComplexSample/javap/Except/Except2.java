/*
Try:
Java execute the statements unless an exception occurs.  If an exception throws java breaks out the try block, by skipping the reminder of the blocks statement and search for a matching catch stmt.
try
{
 method();
}


Catch:
It  immediately fires after try block it specifies the exception type that u wish to catch.

catch(Exception type object)
{
stmt;
}



Syntax for try and catch:
 try
       {
         stmt;
        }catch(Exception name){  } 
*/



class Except2{
	public static void main(String args[]){
		int a=0;
		int b;
		try{
			b=10/a;
			System.out.println("Statement after Division");
	}catch(ArithmeticException e){
			System.out.println("Division by zero");
		}
		System.out.println("Statement after Exception");
		b=0;
		System.out.println("Value of b = " + b);
	}
}