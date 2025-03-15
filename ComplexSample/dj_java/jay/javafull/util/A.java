import java.util.ArrayList;
class A
{
	public static void main(String args[])
	{
		ArrayList a=new ArrayList(3);
		a.add("A");
		a.add("B");
		a.add("C");
		System.out.println("Before:");
		System.out.println(a);
		a.add("D");
		a.add(2,"E");
		System.out.println("After:");
		System.out.println(a);
		a.remove(4);
		System.out.println(a);

	}
}