//EXAMPLE FOR OVERRIDING 
//Same function name in different classes.
class A
{
	  int i,j;
	  A (int a,int b)
	  {
		    i=a;
		    j=b;	
	  }
	//display i and j
  	void show()
	  {
	    System.out.println("i and j :" +i+ "," +j);
	  }
}
	
class B extends A
{
	  int k;
	  B(int a,int b,int c)
	  {
	    super(a,b);
	    k=c;
	  }
/*  Method in the subclass which overrides the method in the superclass
	display k-this overrides show() in A*/
	  void show()
	  {
      	  super.show(); 
                        System.out.println("K : " +k);
	  }
}


class Override
{
	  public static void main(String args[])
	  {
	    B ob1=new B(5,10,30);
	     ob1.show();
//	     ob1.show();      //This calls show() in B
	  }
}
