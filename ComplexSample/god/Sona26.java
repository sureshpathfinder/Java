
public class Sona26
{
     public static void main(String args[])
       {
	String s1 = new String("abc");
	String s2 = new String("abc");
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