public abstract final class Test{
	int x=0; int y=3;
	public int doIt(){
		return x*y;
	}

	public static void main(String arg[])
	{
		Test t=new Test();
		System.out.println(t.doIt());
	}
}