public class th_get extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      printMsg();
    }
  }

  public void printMsg() {
    Thread t = Thread.currentThread();
    String name = t.getName();
    System.out.println("name=" + name);
  }

  public static void main(String[] args) {
    th_get tt = new th_get();
    tt.start();

    for (int i = 0; i < 10; i++) {
      tt.printMsg();
    }
  }
}