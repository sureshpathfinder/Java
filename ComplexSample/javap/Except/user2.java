class UseDefinedException extends Exception{
                 String msg = "";
                  int marks;
                 public UseDefinedException() ){

 }
               public UseDefinedException(String str){
               super(str);
 }
              public String toString(){
               if marks <= 50)
               msg = "You have failed";      

              if marks > 50)         

             msg = "You have Passed";
             return msg;
}
}
public class user2{
        public static void main(String args[]){
        user2 t = new user2();
         t.mm();
}
        public void mm(){
            try{
           int i=0;

          if( i < 50) 
        throw new MyException();

}
       catch(MyException ee1){
      System.out.println("my ex"+ee1);
}
}
} 