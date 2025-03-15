class A{
         A(){System.out.println("SuperA");}
         A(int i){
	     System.out.println(i);
	}
}
	
public class Sona38 extends A {
      Sona38(int a){ System.out.println("SOna Con="+(a));}
       static A a = new A(1);
     static A c = new A(3);

public static void main(String args []){
       A b = new A(2);

  Sona38 s = new Sona38(10);
       }
   
}
	


	