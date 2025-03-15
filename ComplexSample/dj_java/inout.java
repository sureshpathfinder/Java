class inout
{
  public static void main(String args[])
  {
    outer ou=new outer();
    ou.add();
   outer.inner1 i=ou.new inner1();
    i.mul();
      }
}



class outer
{
  int a=10,b=20;
  void add()
  {
    int c=a+b;
    System.out.println("Resultant for Addition="+ c);
    //inner1 in=new inner1();
    //in.mul();
  }

    class inner1
  {
    int d=2,e=2;
    void mul()
    {
      int f=d*e;
      System.out.println("Result for multiplication ="+f);
    }
  }

}

    
    
    
    