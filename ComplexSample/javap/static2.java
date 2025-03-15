class static2
{

static int a ;

static void disp() 
{

System.out.println("a = " + (a++));

}
static
{
a=2;
}
public static void main(String args[])
{
disp();
disp();
disp();
}
}