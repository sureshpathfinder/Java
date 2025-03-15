interface A{
	public void display();
	}

class B implements A{
	
	public void display(){
	           System.out.println("DISPLAY");
	}
	
	public void act(){
	           System.out.println("ACT");
	}
}

public class Sona31 extends B
{
	public void show(){
	           System.out.println("SHOW");
	}

     public static void main(String args[])
       {
	B b = new B();
	Sona31 s = new Sona31();
	A a = new Sona31();

	b.display();	b.act();	b.show();
	s.display();	s.act();	s.show();
	a.display();	a.act();	a.show();
      }	
}