/*
Throw
 So far we saw only been catching exceptions that are thrown by the java at runtime.  However it is possible to thow an exception explicitly ie by the user itself.
*/


class Throw1{

 static void demo()
 {
  throw new NullPointerException("Explicit");
 }

 public static void main(String args[]){
  try{
   demo();  
  }catch(NullPointerException e){
   System.out.println(e);
 // throw e;
  }
 }
}

 