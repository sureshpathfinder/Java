 class Super{
	public void m(int i){
		System.out.println("Super i: "+i);
		}
	}

public class Sub extends Super{
	public void m(int j){
		System.out.println("Sub j: "+j);
	}
	public void m(String s){
		System.out.println("Sub s: "+s);
	}
	public static void main(String [] args)
	{
		Super s1= new Super();
		Super s2=new Sub();
s1.m(5);s1.m(6);
	}
}
