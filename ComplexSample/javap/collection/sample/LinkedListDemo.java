import java.util.*;

public class LinkedListDemo
{
  public static void main(String[] args)
  {
    LinkedList link=new LinkedList();
    link.add("a");
    link.add("b");
    System.out.println("The contents of array is " + link);
    System.out.println("The size of an linkedlist is " + link.size());
    
    link.addFirst(new Integer(1));
    System.out.println("The contents of array is " + link);
    System.out.println("The size of an linkedlist is " + link.size());

    link.addLast("End");
    System.out.println("The contents of array is " + link);
    System.out.println("The size of an linkedlist is " + link.size());

    link.add(3,new Integer(100));
    System.out.println("The contents of array is " + link);
    System.out.println("The size of an linkedlist is " + link.size());

    link.remove(2);
    System.out.println("The contents of array is " + link);
    System.out.println("The size of an linkedlist is " + link.size());
  }
}