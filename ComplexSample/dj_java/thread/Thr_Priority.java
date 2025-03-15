class Thr_Priority implements Runnable 
{       
  public void run() 
  {
     for (int x = 1; x <= 3; x++)
    System.out.println(x + " This is thread "
                                        + Thread.currentThread().getName());
        }

        public static void main(String[] args) 
        {
                Thread t1 = new Thread(new Thr_Priority(),"A");
                Thread t2 = new Thread(new Thr_Priority(),"B");
                Thread t3 = new Thread(new Thr_Priority(),"C");
                t1.setPriority(10);
                t2.setPriority(5);
                t1.start();
                t2.start();
                t3.start();
        }
}
