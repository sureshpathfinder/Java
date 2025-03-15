public class Stringfn
{
	public static void main(String args[])
	{
		if("String".toString() == "String")
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(" String ".trim() == "String")
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if( "STRING".toUpperCase() == "STRING")
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if("String".substring(0) == "String")
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if("String".replace('t','t') == "String")
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
}	
}