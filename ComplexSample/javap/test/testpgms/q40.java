public class Test { 
                public Test(float f){ 
                        printMessage(f); 
                } 
                public void printMessage(float f){ 
                        System.out.println("object "+"number "+f+" created"); 
                } 
                public static void main(String str[]){ 
                        Test t1; 
                        Test t2 = new Test(1+9); 
                        t1 = t2; 
                } 
        } 

