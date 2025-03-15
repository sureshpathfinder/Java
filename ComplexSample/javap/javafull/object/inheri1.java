/*Inheritance:
	Assigning Properties of one class to another class
is called inheritance.

A class which inherits its properties to another class is called Parent or Base class

A class which gets inherited its properties from  another class is called Child or Derived Class.

A Class can inherits its properties to another class by using
the keyword extends.


Types of inheritance
-------------------------------
1. Single inheritance
2. Multilevel Inheritance
3. Multiple Inheritance(Java does not support multiple Inheritance)
4. Hybrid Inheritance(Joining More than one inheritance concept)
5. Hierarchial Inheritance.

*/


 /* single inheritance:-Deriving from a single base class 

	Class A(Parent class to B)
	     |
	     |
	Class B(Child class to A)
*/

 class base
 {
	int a,b;	
	void first()
	{
		a=10;
		b=12;
	System.out.println("a="+a);
	System.out.println("b="+b);
	}

}

 class derive extends base
 {
	int c;
	void second()
	{
		c=a+b;
		System.out.println("c="+c);
	 }

}
 class inheri1
 {
        public static void main(String ar[])
        {
                derive d=new derive();
            	d.first();
	d.second();
        }
}


