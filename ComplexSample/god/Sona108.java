interface A{
public void act();
}

interface B{
public void act();
}

public class Sona108 implements A,B{
  
public void act(){
   System.out.println("I AM A PLAYBOY");
}

public static void main(String args[]){
    Sona108 s = new Sona108();
    s.act();
}
}