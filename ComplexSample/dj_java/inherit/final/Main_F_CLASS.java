class Main_F_CLASS
 {
  public static void main(String args[])
  {
    DER d=new DER();
    d.show();
    d.display();
  }
}
    

class DER extends NO_INHER
{
  int x=100;
  void show()
  {
    System.out.println(x+c);
  }
}
 
    
    

final class NO_INHER
{
  int a,b,c;
  NO_INHER()
  {
    a=10;
    b=20;
  }
  void display()
  {
    c=a+b;
    System.out.println("Result ="+c);
  }
}


                    
    