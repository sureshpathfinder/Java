class String2
{
	public static void main(String args[])
	{
		String s = "This is a sample program";
		System.out.println(s.indexOf('p'));
		System.out.println(s.indexOf('p',14));
		System.out.println(s.lastIndexOf('p'));
		System.out.println(s.indexOf("sample"));
		System.out.println(s.lastIndexOf("sample"));
		System.out.println(s.substring (10,13));
		System.out.println("hello".concat ("chennai"));
		System.out.println("hello".replace('l','w'));
		System.out.println(" hi how are you ".trim());
		System.out.println(String.valueOf (10));
		System.out.println("this is a java pgm".toUpperCase());
		System.out.println("THIS IS A JAVA PGM".toLowerCase());
		String st1=new String("abc");
		String st2=new String("abc");
		System.out.println(st1.equals(st2));
		System.out.println(st1==st2);
	}
}