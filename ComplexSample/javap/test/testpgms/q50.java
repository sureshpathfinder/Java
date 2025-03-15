public class q50 { 
   public int x = 99; 
   private String s = "Hi"; 
   public void method1(){ 
      int x = 66; 
      class MyClass{ 
         public float y = 45.9f; 
         public void method2(){ 
            System.out.println("x = "); 
         } 
      } 
      MyClass m = new MyClass(); 
      m.method2(); 
   } 
   public static void main(String st[]){ 
     q50 t1 = new q50(); 
     t1.method1(); 
   } 
} 
