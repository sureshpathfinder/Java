public class MainClass
{
	public static void main(String args[])
	{
		String h ="Hello";
		Base b= new Base();
		b.display(h);// executes base class version of display() method
		Sub1 s1=new Sub1();
		s1.display(h);//executes sub1 class display() method
		s1.details(); // executes details() method 

		Sub2 s2=new Sub2();
		s2.display(h);//executes sub2 version of display()
		s2.prnt();
		b=new Sub1();
		b.display(h);// executes sub1 class display() method
		//b.details(); compiler error since base class doest know about details() method so it will not execute
		b=new Sub2();
		b.display(h);// executes sub2 class display() method
	}	
}
