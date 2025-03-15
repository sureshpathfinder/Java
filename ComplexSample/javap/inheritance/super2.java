class super2
{
public static void main(String args[]) {
B b = new B(1, 2);
b.show();
}
}
class A
{
int i;
A(int a)
{
  i=a;
}
  
}
// Create a subclass by extending class A.
class B extends A 
{
int j; // this i hides the i in A
B(int x, int y) 
{
super(a); // i in A
j = y; // i in B
}
void show()
{
System.out.println("i in superclass: " +i);
System.out.println("i in subclass: " + j);
}
}
