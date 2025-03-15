import java.io.*;
import java.util.*;
class MyException extends Exception
{
         MyException(String msg)
	{
			 super(msg);
	}
	}
public class ChainExcep
        {
        public static void main(String args[])throws MyException, IOException
          {
          try{
           int rs=10/0;
      }
       catch(Exception e)
         {
		    System.err.println(e.getMessage());
			System.err.println(e.getCause());
		   throw new MyException("Chained ArithmeticException");
         
             }
           }
    }
