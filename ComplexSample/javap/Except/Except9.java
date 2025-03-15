public class MyException extends Exception{
	private int detail;

	MyException(){
		detail=0;
	}

	MyException(int x){
		detail=x;
	}

	public String toString(){
		return "MyException[" + detail + "]";
	}
}
class Except9{
	public static void main(String args[]){
		int a=10;
		try{
		   if(a>5){
			throw new MyException(a);
		   }
		}catch(MyException e){   System.out.println(e);   }
	}
}
			