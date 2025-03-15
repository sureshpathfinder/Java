/* Class can be used to create objects of that type.
It includes 2 steps. First is declaring a variable and then acquiring
physical copy of the object and assign it to that variable.

ex:- Flower rose=new Flower()  //new will allocates memory for an object
The declared variable rose will acquire the color, smell and the properties
of flower*/

class rect
{
        double length;
        double breadth;
}
class class1
{
        public static void main(String ar[])
        {
                 rect r=new rect();     // r is an object similarly we can assign many objects
                 double area;
                 r.length=20;
                 r.breadth=10;
                 area=r.length*r.breadth;
                 System.out.println("Area of Rectangle = "+area);
         }
}
                
