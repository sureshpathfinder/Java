class A
  {
  }

class B extends A implements E
  {
  }

class C extends A 
  {
  }

class D extends B
  {
  }

interface E
  {
  }

public class Sona335
  {
     public static void main(String[] args)
       {
            A a = new A();
            B b = new B();
            C c = new C();
            D d = new D();
  
            E e1 = (E) a;
            E e2 = new A();
            E e3 = new B();
       }
  }

