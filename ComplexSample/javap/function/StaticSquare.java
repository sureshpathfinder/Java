import java.io.*;

class StaticSquare {
  public static int x;
  public static int y;
  public static void main(int x1, int y1){
   x=x1;
   y=y1;
   }
    public int square1(){
    return (x*x);
    }
    public int square2(){
    return (y*y);
    }
    public static void main(String args[]){
      try{
        StaticSquare staticSquare=new StaticSquare();
        BufferedReader sq=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter two number");
        int a=Integer.parseInt(sq.readLine());
        int b=Integer.parseInt(sq.readLine());
        staticSquare.main(a,b);
        System.out.println("value1 is=" + a);
        System.out.println("value2 is="+ b);  
        int sq1=staticSquare.square1();
        int sq2=staticSquare.square2();    
        System.out.println("square of value1 is= " + sq1);
        System.out.println("square of value2 is= "+ sq2);  
        }
        catch(Exception e){}
    }
} 