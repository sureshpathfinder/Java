import java.util.*;
class LinkedListOper
{
public static void main(String args[])
{
LinkedList l=new LinkedList();
l.add("Apple");
l.add("Mango");
l.add("Banana");
System.out.println("The linked list after adding first three elements is"+l+"\n");
l.addFirst("papaya");
l.addLast("Grapes");
System.out.println("The linked list after adding two more elements is:"+l+"\n");
System.out.println("The third element in linked list is"+l.get(2)+"\n");
l.remove("Mango");
System.out.println("The linked list after removing element mango is :"+l+"\n");
l.set(3,"Orange");
System.out.println("The linked list after changing fourth element is:"+l+"\n");
}
}
