class throws1
{
void display() throws ArithmeticException
	{
	System.out.println("inside mymethod");
		int n=0;
		int j=12/n;
		System.out.println("not printed");
	}
}
class exthrows
{
	public static void main(String arg[]) 
	{
	try{
	throws1 obj=new throws1();
	obj.display();
	}	
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	}
}
