import java.io.*;
public class NestedTry{
	public static void main (String args[])throws IOException	{
		int num=2,res=0;
		
		try{
			FileInputStream fis=null;
	fis = new FileInputStream (new File (args[0]));
			try{
			res=num/0;
		System.out.println("The result is"+res);
		}
		catch(ArithmeticException e){
	System.out.println("divided by Zero");
		}
	}
	catch (FileNotFoundException e){
		System.out.println("File not found!");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index is Out of bound!Argument required");
		}
	catch(Exception e){
System.out.println("Error.."+e);
	}
}

}

