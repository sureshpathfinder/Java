class A
{
	int i;
	int j;
	void setij(int x,int y)
	{
		i=x;
		j=y;
	}
}
class B extends A
{
	int total;
//	int i=5;
	void sum()
	{
		total=i+j;
	}
}
class Access
{
	public static void main(String a[])
	{
		B sub=new B();
		sub.setij(10,12);
		sub.sum();
		System.out.println("Total is "+sub.total);
		System.out.println("B i is "+sub.i);
		A a1=new A();
		a1.i=8;
		System.out.println("A i is "+a1.i);
	}
}