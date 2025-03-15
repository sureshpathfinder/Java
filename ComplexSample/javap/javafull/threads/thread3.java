//Thread Methods
class thread3
{
        public static void main(String ar[])
        {
                Thread t=Thread.currentThread();
                System.out.println("Current thread : "+t);
                System.out.println("Name of the current Thread : "+t.getName());
                System.out.println("Priority : "+t.getPriority());
                t.setName("Karthik");
                System.out.println("After name Change : "+t);
                t.setPriority(2);
                System.out.println("After Priority Change : "+t);
                System.out.println("Number of active threads : "+t.activeCount());
        }
}        

