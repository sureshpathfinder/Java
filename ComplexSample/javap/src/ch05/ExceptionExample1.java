class ExceptionExample1 
{
	public static void main(String[] args) 
	{
		int d,a;
		try
		{
			d=0;
			a=42/d;	// Exception is here
			System.out.println("This will not be printed");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero.");
		}		
	}
}
