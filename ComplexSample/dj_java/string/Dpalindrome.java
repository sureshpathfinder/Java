class Dpalindrome 
{ 
public static void main(String[] args) 
{ 
String str = "malAyalaM"; 

StringBuffer sb = new StringBuffer(str).reverse(); 

String strRev = sb.toString(); 

if(str.equalsIgnoreCase(strRev)) 
{ 
System.out.println("Palindrome"); 
} 
else 
{ 
System.out.println("Not a Palindrome"); 
} 
} 
} 
