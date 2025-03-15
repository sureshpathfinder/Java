class constructor
{
  int a,b;
  constructor()
  {
    a=10;
    b=20;
    System.out.println("Default = "+(a+b));
  }
  
  constructor(int a,int b)
  {
    this.a=a;
    this.b=b;
    System.out.println("Parametrization = "+(a+b));
  }
  
  constructor(constructor f)
  {
    System.out.println("Copy = "+(f.a*f.b));
  }
  
  public static void main(String args[])
  {
    constructor c1,c2,c3;
    c1=new constructor();
    c2=new constructor(1,2);
    c3=new constructor(c2);
  }
}

