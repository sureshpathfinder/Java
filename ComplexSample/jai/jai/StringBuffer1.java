class StringBuffer1
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer("hello this is");
		System.out.println(s.length());
		s.ensureCapacity(31);
		char c[]=new char[8];
		c[5]='w';
		c[6]='a';
		c[7]='s';
  		System.out.println(s.capacity());
		System.out.println(s.charAt(4));
		s.setCharAt(1,'i');
		System.out.println(s);
		s.getChars(6, 10, c, 0);
		System.out.println(c);
		System.out.println(s.append(" jay"));
		s.insert(6, "world");
		System.out.println(s);
		s.delete(6,11);
      		System.out.println(s);
		s.replace(11,13,"was");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.deleteCharAt(0);
		System.out.println(s);
		System.out.println(s.substring(7,11));
	}
}