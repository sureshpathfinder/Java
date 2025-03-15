class Throw2{

	static void demo(){
		throw new IllegalAccessException();
	}

	public static void main(String args[]){
		try{
			demo();		
		}catch(IllegalAccessException e){
			System.out.println(e);
		}
	}
}

	