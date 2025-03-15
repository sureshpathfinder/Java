 class A {
      String p,s;
      public A(String a,String b)        //parameter constructor
      {
           p=a;
           s=b;
      }

      public String zzz(){
           return p;
      }
 }

public class Sona44 extends A {
             public Sona44(String a,String b){
                 super(a,b);
		System.out.println(p);

              }

            public String zzz(){
                 return (p+"     "+s);
	      }

           public static void main(String[] args){  
                A a=new A("hello","there");
                A b=new Sona44("dad","mom");
	
	System.out.println(a.zzz());
	System.out.println(b.zzz());

           }


}             
              
     