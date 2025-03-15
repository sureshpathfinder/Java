import java.util.*;

class linkedlistCopy
{
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.addFirst("one");
		l.addFirst("two");
		l.addFirst("three");
		l.addLast("four");
		l.addLast("five");
		l.add(2,"new1");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	}
}