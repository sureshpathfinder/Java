       class MyFirstClass{ 
                public MyFirstClass(int k){ 
                        System.out.println("we are in MyFirstClass"); 
                } 
        } 
        public class Test extends MyFirstClass { 
                 Test(){ 
                        System.out.println(",we are in Test"); 
                } 
                public static void main(String st[]){ 
                        Test t1 = new Test(); 
                } 
        } 
