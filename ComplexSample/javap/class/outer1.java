class outer1 
{
public static void main(String args[])
{
outer o = new outer();
o.test();
outer.Inner i =o. new Inner();
i.disp();

}
}
class outer
{
int n = 100;

void test()
{
/*Inner i = new Inner();
i.disp();*/
  System.out.println("display");
}
// this is an inner class
class Inner 
{
void disp() 
{
System.out.println("display: o = " + n);
}
}
}
