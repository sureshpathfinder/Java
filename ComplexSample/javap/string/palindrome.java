Class Palindrome
{ public static void main(String args[]) 
{  
String s="malayalam"; 
 int i;  int n=s.length(); 
 String str="";  
for(i=n-1;i>=0;i--) 
 str=str+s.charAt(i);  
if(str.equals(s))  
System.out.println(s+ "is palindrome");  
else  System.out.println(s+ "is not a palindrome");
 }
}
