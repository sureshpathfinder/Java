class Except8{

	static void demo() throws IllegalAccessException{
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

	