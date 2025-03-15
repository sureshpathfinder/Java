public class Sona28
{
     public static void main(String args[])
       {
	try{
	       System.out.println("ONE");
	       int a = 4/0;
	}

	catch(Exception e){
	       System.out.println("TWO");
	        return ;
	}
	
	finally{
      	       System.out.println("THREE");
	}

      }	
}