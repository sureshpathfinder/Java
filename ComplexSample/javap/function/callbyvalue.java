class callbyvalue
{
void swap(int a, int b)
{
int c=a;
a=b;
b=c;
}



public static void main(String args[])
{
callByvalue ob = new callByvalue();
int a = 15, b = 20;
System.out.println("a and b before call: " +
a + " " + b);
ob.swap(a, b);
System.out.println("a and b after call: " +
a + " " + b);
}
}