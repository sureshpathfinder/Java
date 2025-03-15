public class th_nam extends Thread {
    public th_nam() {
    }

    public th_nam(String name) {
        super(name);
    }

  
    public void run() {
        //
        // Call getName() method to get the thread name of this
        // thread object.
        //
        System.out.println("Running [" + this.getName() + "]");
    }

    public static void main(String[] args) {
        Thread thread1 = new th_nam();
        thread1.setName("FOX");
        thread1.start();

        Thread thread2 = new th_nam("DOG");
        thread2.start();
    }
}
