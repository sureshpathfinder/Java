class A
     {
        String firstname;
        String secondname;

        A()
          {
          }

        A(String f,String s)
          {
              firstname=f;
              secondname=s;
          }

        public String toString()
          {
              return "It is Monopoly Mr." +  firstname;
          }
     }

 class B extends A
       {
           String firstname;
           String secondname;

	B() { 
	}         

         B(String f,String s)
          {
              firstname=f;
              secondname=s;
          }

        public String toString()
          {
              return "It is Monopoly Mr." +  secondname + "     " +firstname;
          }
     }

public class Sona57
     {
          public static void main(String[] args)
            {
               A first=new A("scott","tiger");
               A second=new B("bill","gates");
               System.out.println(second +"\n"+ first);
            }
    }                