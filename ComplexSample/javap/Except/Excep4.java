/* DAY - 13 EXCEPTIONS - USER DEFINED EXCEPTION
*/


 class Excep4 extends NEE
 {
	public static void main(String[] a)
	{
		try
	{
		int balance=90;    
	              System.out.println("balance");
		if(balance<100){
	  		throw new NEE();
                    	}
		else
		 {  System.out.println("Balance is Rs."+balance);
		 }	
	}
	catch(NEE nex)
	{
		System.out.println(nex.message());
	}
	
	}
}
