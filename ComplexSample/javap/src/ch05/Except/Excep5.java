/* DAY - 13 EXCEPTIONS - NESTED TRY CATCH
*/
class Excep5
{
	public static void main(String[] x)
	{
		try
		{
		int a=10,b=1,c;
		int m[]={1,2,3};
		c=a/b;
		System.out.println("The Result is : "+c);
			try
			{
				m[4]=c;
				System.out.println("The Result is : "+m[4]);
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(e1);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}
}
