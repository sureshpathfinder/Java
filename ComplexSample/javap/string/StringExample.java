import java.io.*;

public class StringExample
{
	public static void main(String args[])
	{
		hai.test1 t=new hai.test1();
	t.hello();
		String s1="FirstString";
		String s2="SecondString";String s3="firST";
		System.out.println("Length of the String s1 is "+s1.length());
		System.out.println("Character 5 at the String s1 is "+s1.charAt(5));
		System.out.println("Comparing two Strings s1 & s2 "+s1.equals(s2));
		System.out.println("Comparing two Strings s1 & s3 "+s1.equalsIgnoreCase(s3));
		System.out.println("Comparing two Strings s1 & s2 "+s1.compareTo(s3));
		System.out.println("Comparing two Strings s1 & s2 "+s1.compareToIgnoreCase(s3));
		System.out.println("startsWith() "+s1.startsWith("First"));
		System.out.println("endsWith() "+s1.endsWith("String"));
		System.out.println("HashCode of s1 "+s1.hashCode());
		System.out.println("Getting the Index of a String s2 "+s2.indexOf('e')+" S "+s2.indexOf('S')+" Last S "+s2.lastIndexOf('S'));
		System.out.println("Substring of s1 "+s1.substring(4,8));
		System.out.println("Concatenation of s1 & s2 "+s1.concat(s2));
		System.out.println("Replace in s1 "+s1.replace('t','z'));
		System.out.println("String s3 in Lowercase "+s3.toLowerCase());
		System.out.println("String s1 in Uppercase "+s1.toUpperCase());
		System.out.println("S1 is "+s1);
	}
}