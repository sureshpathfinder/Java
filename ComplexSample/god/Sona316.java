public class Sona316 extends Thread
{
    public static void main(String argv[])
    {
                 Sona316 b = new Sona316();
        	b.run();
    }
    
      public void start()
      {
        	for (int i = 0; i <10; i++)
                 {
                	   System.out.println("Value of i = " + i);
                 }
      }
}

