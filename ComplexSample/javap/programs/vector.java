import java.io.*;
import java.util.*;
import java.lang.*;
class vector
{
public static void main(String args[])throws IOException
{
Vector v=new Vector();
String temp;
int p,ch=1;
DataInputStream ds=new DataInputStream(System.in);
while(ch!=5)
{
System.out.println(" Menu \n");
System.out.println( " -----------");
System.out.println("\n 1.ADD \n 2.DELETE \n 3.INSERT \n 4.DISPLAY \n 5.EXIT \n");
System.out.print("\n Enter your choice: ");
ch=Integer.parseInt(ds.readLine());
System.out.println();
switch(ch)
{
case 1:
System.out.println("\n Enter the Element :");
temp=ds.readLine();
v.addElement(temp);
break;
case 2:
System.out.println("\n Enter the Position :");
p=Integer.parseInt(ds.readLine());
v.removeElementAt(p);
break;
case 3:
System.out.println("\n Enter the Element :");
temp=ds.readLine();
System.out.println("\n Enter the Position :");
p=Integer.parseInt(ds.readLine());
v.insertElementAt(temp,p);
break;
case 4:
for(int i=0;i<v.size();i++)
{
System.out.println(v.elementAt(i));
}
}
}
}

}