 
class A
  {

}

public class Sona1 extends A
{
     public static void main(String args[])
       {
	A a = new Sona1();
                 Sona1 s = new A();
       	a = s;
	s = a;
	A a =(A) new Sona1();
                 Sona1 s =(Sona1) new A();


     }	
}
