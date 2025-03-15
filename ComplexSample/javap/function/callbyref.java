class callbyref
{
int a, b;
callbyref(int i, int j) {
a = i;
b = j;
}
void swap(callbyref o)
{
int c=o.a;
o.a=o.b;
o.b=c;
}




public static void main(String args[])
{
callbyref ob = new callbyref(15, 20);
System.out.println("ob.a and ob.b before call: " +
ob.a + " " + ob.b);
ob.swap(ob);
System.out.println("ob.a and ob.b after call: " +
ob.a + " " + ob.b);
}
}