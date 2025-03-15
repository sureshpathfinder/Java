class abstract2
{
  public static void main(String ar[])
  {
    Rectangle r= new Rectangle();
    r.setArea(2,3);
    Triangle t=new Triangle();
    t.setArea(2,3);
  }
}
abstract class Base
{
  
  double area,length, breadth;
  abstract double area();
  public void setArea(double length, double breadth)
  {
   this.length = length;
   this.breadth = breadth;
   
   System.out.println("Calculating the area of a ..");
   System.out.println("The area is  ");
   System.out.println(area());
 }
}
class Rectangle extends Base
{
  double area()
  {
    area = length*breadth;
    return(area);
  }
}

class Triangle extends Base
{
  double area()
  {
    area =0.5*length*breadth;
    return(area);
  }
}