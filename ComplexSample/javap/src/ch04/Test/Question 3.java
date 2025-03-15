class Demo 
{
	public static String Demo2(int i,int i1){
		return "Int/Int, ";
	}
	
	public static String Demo2(double d,double d1){
		return "Double/Double, ";
	}
	
	public static String Demo2(double d,int i	1){
		return "Double/Int, ";
	}
	public static void main(String[] args) 
	{
		String i1=Demo2(7.2,2);
		System.out.println(i1);
		i1=Demo2(7,2);
		System.out.println(i1);
		i1=Demo2(7.2,8.5);
		System.out.println(i1);
	}
}
