class outer
{
 int i=10;
 void display()
 { 
   class inner
   {
     String s="Hello";
     void innerdisp()
     {
       System.out.println("i "+i);
       System.out.println("s "+s);
     }
   }
 
 inner in=new inner();
 in.innerdisp();
 }
 public static void main(String args[])
 {
  outer o=new outer();
  o.display();
 }
}  