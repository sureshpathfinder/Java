class Except4{
public static void main(String args[])
{
	try{
	throw new NullPointerException();
	}
catch(NullPointerException e)
{
	System.out.println(e);
}
}
}

	