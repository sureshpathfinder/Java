import java.util.*;

class Main_F_Var
{
  public static void main(String args[])
  {
    Final_variable f1=new Final_variable();
    f1.AreaOfCircle();
  }
}

class Final_variable
{
  final double pi=3.14;
  double circle;
  void AreaOfCircle()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Radius =");
    int r=s.nextInt();
    circle=2*pi*r;
    System.out.println("Area of Circle = "+circle);
  }
}


    
    