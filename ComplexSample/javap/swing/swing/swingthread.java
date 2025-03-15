import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingthread extends Object
{
    public static void main(String ar[])
    {

        JFrame frame=new JFrame("Karthik's Progress Monitor");
        JButton b=new JButton("Press");
        frame.getContentPane().add(b,BorderLayout.CENTER);
        int min=0;
        int max=100;
        String[] message=new String[2];
        message[0]="Performing Operation.";
        message[1]="Please Wait...";
        final ProgressMonitor monitor=new ProgressMonitor(frame,message,"Iteration",min,max);
        final Runnable run=new Runnable()
        {
                public void run()
                {
                        int sleeptime=500;
                        for(int i=1;i<100;i++)
                        {
                                try
                                {
                                        monitor.setNote(i+" %");
                                        monitor.setProgress(i);
                                        if(monitor.isCanceled())
                                        {
                                                monitor.setProgress(100);
                                                break;
                                        }
                                        Thread.sleep(sleeptime);
                                }catch(InterruptedException e)
                                {}
                        }
                        monitor.close();
                }
        };
        b.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                        Thread t=new Thread(run);
                        t.start();
                }
        });
        frame.pack();
        frame.setVisible(true);
        }
}


