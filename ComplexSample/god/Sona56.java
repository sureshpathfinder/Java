class A
     {
         String name;
      
         A(String s)
           {
                name=s;
           }
      }

public class Sona56 extends A
     {
          String name;
       
          Sona56(String s)
            {
	super("abc");
               name=s;
            }

        public static void main(String[] args)
           {
               A a=new A("First");
               Sona56 s=new Sona56("Second");
            
               System.out.println(s.name+"          "+a.name);
           }
    }  