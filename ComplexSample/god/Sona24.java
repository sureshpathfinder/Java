interface A
               {
	public void display1();
	public void display2();
               }
interface B extends A
               {
	public void display3();
	public void display4();
               }

public class Sona24 implements B{

	public void display1() {}
	public void display3() {}
	public void display4() {}

    public static void main(String args[])
       {
	
      }
}