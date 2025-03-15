class A{
	 static void show(){
        System.out.println("HAI AA");
     }
}

public class Sona30 extends A{
   	static void show(){
        System.out.println("HAI SONA");
    }
    public static void main(String args[])  {
      A a = new A();
      Sona30  s = new Sona30();
      a.show();
      s.show();
     a = s;
     a.show();
   //s = a;
    s.show();
 }
} 