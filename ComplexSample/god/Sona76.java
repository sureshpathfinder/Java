public class Sona76{
               
     public static void main(String[] args){
          outer:
              for(int i =0 ;i<2 ; i++)
          inner:
              for(int a =0 ;a<2 ; a++){
                 if(a==1){
                   break inner;
	}
                 System.out.println("a is " +a +"i is" + i);	
              }
     }
} 