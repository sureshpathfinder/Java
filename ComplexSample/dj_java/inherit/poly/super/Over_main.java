class Over_main
{
  public static void main(String args[])
  {
    overder or=new overder();
    or.display();
   }
}
    

class overbase
{
  void display()
  {
    System.out.println("Base");
  }
}


class overder extends overbase
{
  void display()
  {
   super.display();
   System.out.println("Derived");
  }
}

