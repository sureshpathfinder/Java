
class Parent{
	}

class A extends Parent{
	}

public class Sona32 extends Parent
{
     public static void main(String args[])
       {
	Parent p = new Parent();
	A a = new A();
	Sona32 s = new Sona32();
	
	p = a;
	p = s;
	
	a = (A) p;
	s = (Sona32) p;

	a = s;
	s = a;
      }	
}