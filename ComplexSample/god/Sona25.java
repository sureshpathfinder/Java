
public class Sona25
{
     public static void main(String args[])
       {
	String s1 = "abc";
	String s2 = "abc";
	s1=s2;
	if(s1==s2)
	  {
	     System.out.println("S1==S2");
	   }
	if(s1.equals(s2))
	  {
	     System.out.println("S1.equals(S2)");
	   }
      }	
}