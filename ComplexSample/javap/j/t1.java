class t1{

	static void demo(){
		throw new NullPointerException();
	}

	public static void main(String args[]){
		try{
			demo();		
		}catch(NullPointerException e){
			System.out.println(e);
		}
	}
}
