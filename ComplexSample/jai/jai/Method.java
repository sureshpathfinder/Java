class Over
{
void show()
{
System.out.println("base class");
}
}
class Ride
{
void show()
{
System.out.println("derived class");
}
}
class Method
{
public static void main(String args[])
{
Ride r=new Ride();
r.show();
}
}
