class hierarchy
{
  public static void main(String s[])
  {
    son1 ss=new son1();
    son2 s2=new son2();
    ss.firstson();
    s2.secondson();
  }
}

class father
{
  float x,y;
  father()
  {
    x=50.55f;
    y=60.55f;
  }
}

class son1 extends father
{
  float a=1.05f;
  void firstson()
  {
    System.out.println("Son 1="+(x+a));
  }
}

class son2 extends father
{
  double b=2.05;
  void secondson()
  {
    System.out.println("Son 2="+(y+b));
  }
}
                      
    
    
    
    