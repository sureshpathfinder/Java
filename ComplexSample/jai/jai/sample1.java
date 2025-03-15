import pack.palin;
import java.util.Scanner;
class sample1
{
public static void main(String args[])
{
System.out.println("enter ur string");
Scanner a=new Scanner(System.in);
String b=a.next(); 
palin p=new palin();
p.palindrome(b);
}
}