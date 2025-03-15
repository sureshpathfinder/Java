class Abs_derived extends base
{
  void show()
  {
    System.out.println("Abstract Method");
  }
  public static void main(String args[])
  {
    base b;
    Abs_derived ab=new Abs_derived();
    b=ab;
    //ab.show();
    //ab.display();
    b.show();
    b.display();
  }
}
    
    

 abstract class base
{
    void display()
    {
      System.out.println("Non_Abstract Method");
    }
    abstract void show();
}
 