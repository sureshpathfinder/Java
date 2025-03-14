import java.util.*;
class Cat
{
private int catnumber;
Cat(int i)
{
catnumber=i;
}
void print()
{
System.out.println("Cat"+catnumber);
}
}
class Dog 
{

private int dognumber;
Dog(int i)
{
dognumber=i;
}
void print()
{
System.out.println("Dog"+dognumber);
}
}
public class CatsDogs
{
public static void main(String args[])
{
Vector c=new Vector();
for(int i=0;i<7;i++)

c.addElement(new Cat(i));
c.addElement(new Dog(7));

for(int i=0;i<c.size();i++)
((Cat)c.elementAt(i)).print();
}
}