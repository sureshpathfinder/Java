class abstract_multi
{
  public static void main(String ar[])
  {
    win a=new win();
    a.hai();
    a.display1();
     win2 a1=new win2();
    
    a1.display1();
    System.out.println("program");
  }
}
abstract class abs{
public void display(){
}
public abstract void display1();

}
public class win extends abs{

public void hai(){
}

public void display1(){
}

}
class win2 extends abs{
public void display1(){
}

public void display(){
}
}

