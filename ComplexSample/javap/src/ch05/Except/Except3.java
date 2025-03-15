/*
Multiple catch

try
{
stmt;
}
catch(exception){}
catch(exception){}
*/

class Except3{
	public static void main(String args[]){
		int a=0;
		int b;
		int c[]=new int [10];
		try{
			b=10/a;
			c[11]=100;
		}catch(ArithmeticException e){
			System.out.println("Error is " + e);
			b=0;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index should be < 10");
		}
	}
}