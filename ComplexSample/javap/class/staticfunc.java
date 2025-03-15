class staticfunc
{
  
  public static void func()
  {
    System.out.println("you can access a static method this way");
  }
  public void disp()
  {
   
    System.out.println("Don't try to access a non static method");
  }   
  public static void main(String arg[])
  {
    staticfunc s=new staticfunc();
    s.disp();
    staticfunc.func();
    
   
  } 
  
} 