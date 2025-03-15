public class Sona29
{
     public static void main(String args[])
       {
	StringBuffer s1 = new StringBuffer("abc");
	StringBuffer s2 = new StringBuffer("abc");
	s1=s2;
	if(s1==s2)
	  {
	     System.out.println("S1==S2");
	   }
	else{
	      System.out.println("ELSES1==S2");
	   }

	if(s1.equals(s2))
	  {
	     System.out.println("S1.equals(S2)");
	   }
	else{
	       System.out.println("ELSES1.equals(S2)");
	   }
      }	
}