import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class progress extends Object
{
public static void main(String args[])
{
	JFrame frame=new JFrame("ProgressMonitor example");
JButton button=new JButton("start");
JButton btn=new JButton("end");
frame.getContentPane().add(button,BorderLayout.CENTER);
frame.getContentPane().add(btn,BorderLayout.NORTH);

int min=0;
int max=100;
String msg[]=new String[2];
msg[0]="Performing operation";
msg[1]="This may take some time";
final ProgressMonitor pm=new ProgressMonitor(frame,msg,"Iteration",min,max);
final Runnable runnable=new Runnable()
{
public void run()
{
   for(int i=1;i<100;i++)
    {
	try
             {
	 pm.setNote("hello"+i);
	 pm.setProgress(i);
	  if(pm.isCanceled())
	 {
		pm.setProgress(100);
	      	break;
	  }
        	Thread.sleep(500);
	}catch(InterruptedException e){}
        }	

pm.close();
}
};
button.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae)
	{
	Thread thread=new Thread(runnable);
	thread.start();
	}
}
);
frame.pack();
frame.setVisible(true);
frame.addWindowListener(new  WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
 
}
}



	