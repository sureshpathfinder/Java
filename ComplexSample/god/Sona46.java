public class Sona46
       {
           public Sona46(int a){
	}
           public static void main(String[] args)
              {
                 Sona46 a=new Sona46(10);
                 Sona46 b=new Sona46(10);
                 
                 Sona46 c=b;
                float d=10;

                 long e=10L;
                 Float f=new Float(10.0F);

                 // what are legal guess
 
	//a==b;  
                // b==c;
                
                if(d==e){
	 System.out.println("TRUE ");
	}
	else{
	 System.out.println("F ");
	}
  	    if(f.equals(d) ){
	 System.out.println("TRUE1 ");
	}
	else{
	 System.out.println("F1 ");
	}         	
                if(f.equals(new Float(10.0F))){
	 System.out.println("TRUE 2");
	}
	else{
	 System.out.println("F2");
	}            }
     }  