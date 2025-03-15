
class A{
       void show(){
	System.out.println("Non Static");	
       }
}

public class Sona33 extends A{
       static void show(int i){
	System.out.println("Over ridden Static"+(i));	
       }
   
      public static void main(String args[]){
	Sona33 s = new Sona33();
	s.show();
	s.show(10);
     }
}
	


	