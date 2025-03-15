public class Parcel
{
class Contents
{
private int i=16;
public int value()
{
return i;
}
}
class Destination
{
private String label;
Destination(String whereTo)
{
label=whereTo;
}
String readLabel()
{
return label;
}
}
public void ship(String dest)
{
Contents c=new Contents();
Destination d=new Destination(dest);
System.out.println("shipped"+c.value()+"items to"+dest);
}
public static void main(String args[])
{
Parcel p=new Parcel();
p.ship("Congo");
}
}
