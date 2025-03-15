import java.util.*;
import java.io.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
public class BookClient
{
public static void main(String args[])
{
Enumeration enum;
Vector bookList;
Book shoppingCart;
try
{
Context initial=new InitialContext();
Object obj=initial.lookup("MyBook");
BookHome home=(BookHome)PortableRemoteObject.narrow(obj,BooKHome.class);
shoppingCart=home.create("Gupta","123");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the book name that u want to add in the shoppingcart");
String book1=br.readLine();
shoppingCart.addBook(book1);
System.out.println("Enter the next book name");
String book2=br.readLine();
shoppingCart.addBook(book2);
System.out.println("Enter the next book name");
String book3=br.readLine();
shoppingCart.addBook(book3);
System.out.println("\n\n selected books are listed below");
bookList=new Vector();
bookList=shoppingCart.getContents();
enum=bookList.elements();
while(enum.hasMoreElements())
{
String title=(String)enum.nextElement();
System.out.println(title);
}
System.out.println("\n\n do u want to remove any book from cart?(y/n)");
String ch=br.readLine();
if(ch.equals("y"))
{
try
{
System.out.println("enter the book name");
String rembook=br.readLine();
shoppingCart.removeBook(rembook);
System.out.println("\n Book has removed from the cart");
System.out.println("\n selected books are listed below");
bookList=shoppingCart.getContents();
enum=bookList.elements();
while(enum.hasMoreElements())
{
String title1=(Stirng)enum.nextElement();
System.out.println(title);
}
System.out.println("\n Thanks for dealing with us");
}
catch(Exception ex)
{
System.err.println("caught a BookException:"+ex.getMessage());
}
}
else
System.out.println("\n Thanks for dealing with us");
shoppingCart.remove();
}
catch(Exception ex)
{
System.err.println("caught an unexpected exception!");
ex.printStackTrace();
}
}
}
  
