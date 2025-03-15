/* DAY - 13 EXCEPTIONS - USER DEFINED EXCEPTION
*/


 class Excep4 extends NEE
 {
	/*try
	{*/
		public void hi(){
			int balance=90;  
			System.out.println("balance");
			if(balance<100){
	  			throw new NEE();System.out.println("ne");
                    	}
			else
			 {  System.out.println("Balance is Rs."+balance);
			 }
		}
	/*}
	catch(NEE nex)
	{
		System.out.println(nex.message());
	}*/
	public static void main(String[] a)
	{
		System.out.println("obj created");
		Excep4 ee=new Excep4();ee.hi();
		NEE ne=new NEE();
		System.out.println("obj created");
		
	}
}
