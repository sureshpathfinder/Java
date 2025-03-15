import java.util.*;
public class ListOper
{
public static void main(String args[])
{
if(args.length==0)
{
System.out.println("input elements for the list as command line arguments");
System.exit(0);
}
List l=new ArrayList();
for(int i=0;i<args.length;i++)
l.add(args[i]);
Collections.reverse(l);
System.out.println("The list in the reverse order is as follows:");
System.out.println(l+"\n");
Collections.sort(l);
System.out.println("The list in sorted order is");
System.out.println(l+"\n");
int index=Collections.binarySearch(l,"c");
System.out.println("The element c is found at :"+index+"\n");
Collections.fill(l,"one");
System.out.println("The list after filling it by word one is as follows");
System.out.println(l+"\n");
List l1=new ArrayList();
l1.add("First");
l1.add("Second");
l1.add("Third");
Collections.copy(l,l1);
System.out.println("The list after replacing the elements by those of l1 is as follows:");
System.out.println(l+"\n");
}
}

