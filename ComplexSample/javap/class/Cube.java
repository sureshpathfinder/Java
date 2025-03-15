public class Cube
{

 int length;
 int breadth;
 int height;
 public int getVolume()
 {
  return (length * breadth * height);
 }
 Cube() 
 {
  length = 10;
  breadth = 10;
  height = 10;
 }
 Cube(int l, int b, int h) 
 {
  length = l;
  breadth = b;
  height = h;
 }
 public static void main(String[] args) 
 {
  Cube c1, c2;
  c1 = new Cube();
  c2= new Cube(10, 20, 30);

  System.out.println("Volume of Cube1 is : " + c1.getVolume());
  System.out.println("Volume of Cube1 is : " + c2.getVolume());
 }
}