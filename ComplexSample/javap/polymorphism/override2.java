public class override2 {

  private void f() {
    System.out.println("private f()");
  }

  public static void main(String[] args) {
    override2 po = new Derived();
    po.f();
  }
}

class Derived extends override2 {
  public void f() {
    System.out.println("public f()");
  }
}