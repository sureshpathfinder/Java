class A
{
int i=7,j=8;
void showij()
{
System.out.println("i and j:"+i+" "+j);
}}
class B extends A
{
int k;
void showk()
{
System.out.println("k: "+k);
}
void sum()
{
System.out.println("i+j+k: "+(i+j+k));
}}
class simple
{
public static void main(String args[])
{

B subOb=new B();


System.out.println("Contents of SuperOb:");
subOb.showij();
System.out.println();


subOb.k=9;
System.out.println("contents of subOb:");
subOb.showij();
subOb.showk();
System.out.println();
System.out.println("sum of i,j and k in subOb:");
subOb.sum();
}}