class Hemisphere extends Sphere
{
Hemisphere()
{
super();
}
float volume()
{
float h=(2*pi*r*r*r)/3;
System.out.println("volume of hemisphere with radius "+r+"is:"+h);
return h;
}
public static void main(String args[])
{
Sphere s=new Hemisphere();
s.get();
s.volume();
}
}
