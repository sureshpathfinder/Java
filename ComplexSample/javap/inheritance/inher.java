class inher
{
public static void main(String args[]) 
{
A a = new A();
B b = new B();
// The superclass may be used by itself.
a.i = 10;
a.j = 20;
System.out.println("Contents of superOb: ");
a.showij();
System.out.println();
/* The subclass has access to all public members of
its superclass. */
b.i = 7;
b.j = 8;
b.k = 9;
System.out.println("Contents of subOb: ");
b.showij();
b.showk();
System.out.println();
System.out.println("Sum of i, j and k in subOb:");
b.sum();
}
}
class A
{
int i, j;
void showij() 
{
System.out.println("i and j: " + i + " " + j);
}
}

// Create a subclass by extending class A.
class B extends A 
{
int k;
void showk()
{
System.out.println("k: " + k);
}
void sum() 
{
System.out.println("i+j+k: " + (i+j+k));
}
}
