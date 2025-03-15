class String1
{
	public static void main(String args[])
	{
 		String s = new String("welcome");
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		char c[]=new char[7];
		c[0]='i';
		c[1]='n';
		s.getChars(3,7,c,2);
		System.out.println(c);
		String sr="Come";
		System.out.println(s.equals("WelCome"));
		System.out.println(s.equalsIgnoreCase("WelCome"));
		System.out.println(s.regionMatches(true,3,sr,0,4));  //true for equalsignore case
		System.out.println(s.startsWith("co",3));
		System.out.println(s.endsWith("me"));
		System.out.println("jay"=="jay");
		System.out.println("aarthi".compareTo("arun"));
	}
}