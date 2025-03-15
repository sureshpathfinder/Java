class Except5{

	static void demo(){
		try{
			throw new NullPointerException();
		}catch(NullPointerException e){
			System.out.println(e);
		}
	}

	public static void main(String args[]){
		demo();		
	}
}

	