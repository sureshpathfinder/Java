class super1
{
public static void main(String args[]) {
B b = new B(1, 2);
b.show();
}
}
class A
{
int i;
}
// Create a subclass by extending class A.
class B extends A 
{
int i; // this i hides the i in A
B(int a, int b) 
{
super.i = a; // i in A
i = b; // i in B
}
void show()
{
System.out.println("i in superclass: " + super.i);
System.out.println("i in subclass: " + i);
}
}
