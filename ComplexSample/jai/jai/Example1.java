class Rect
{
	int l, b;
	Rect(int a, int b)
	{
		l = a;
		this.b = b;
	}
	void area()
	{
		System.out.println("Area of rectangle="+l*b);
	}
}
class Example1
{
	public static void main(String args[])
	{
		Rect r = new Rect(10, 20);
		r.area();
	}
}