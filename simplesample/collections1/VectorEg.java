import java.util.*;
class VectorEg
{
public static void main(String args[])
{
Vector v=new Vector();
v.add("First");
int i=1;
v.add(new Integer(i));
double d=1.1;
v.add(new Double(d));
v.add("Second");
i=2;
v.add(new Integer(i));
d=2.2;
v.add(new Double(d));
Enumeration e =v.elements();
System.out.println("The elements of the vector are:\n");
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
System.out.println("The capacity of vector is:"+v.capacity());
System.out.println("The size of vector is:"+v.size());
System.out.println("The second element of vector is:"+v.elementAt(1));
System.out.println("The first element of vector is :"+v.firstElement());
System.out.println("The last element of vector is:"+v.lastElement());
v.removeElementAt(2);
e=v.elements();
System.out.println("The vector after removing one of its elements is:");
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
}
}
