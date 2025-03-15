class A
{
     int a;
     public void display(int b)
       {
	 a=b++;
	System.out.println(a);
      }
}

public class Sona14 extends A
{
      static int c=7;
      public static void main(String args[])
       {
	A a = new A();
	a.display(c);
       }	
}
