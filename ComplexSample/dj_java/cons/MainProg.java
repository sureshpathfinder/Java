class MainProg
{
  public static void main(String args[])
  {
    oneouter one=new oneouter();
    one.outer_1();
    oneouter.demoinner nes=one.new demoinner();
    nes.inner_1();    
   }        
}
    
    
class oneouter
{
   void outer_1()
  {
    System.out.println("Normal class");                             
  }

  class demoinner                                                             //Nested class (or) Inner class
  {
    
    void inner_1()
      {
         System.out.println("Inner class/nested class");
         local_inner in=new local_inner();
       }
        
    
    class local_inner                                                      
        {
          local_inner()                                                            //Local Inner class
          {
            System.out.println("Local Inner Class");
          }
        }    
      
  }
}

