import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class progressTest extends Object
{
public static void main(String args[])
{
JFrame frame=new JFrame("ProgressMonitor example");
JButton button=new JButton("start");
frame.getContentPane().add(button,BorderLayout.CENTER);
int min=0;
int max=100;
String[] message=new String[2];
message[0]="Performing Operation.";
message[1]="This may take some time.....";
final ProgressMonitor m=new ProgressMonitor(frame,message,"Iteration",min,max);
final Runnable r=new Runnable()
{
public void run()
{
int sleepTime=500;
for(int i=1;i<100;i++)
{
try
{
m.setNote("Iteration"+i);
m.setProgress(i);
if(m.isCanceled())
{
m.setProgress(100);
break;
}
Thread.sleep(sleepTime);
}
catch(InterruptedException d)
{
}
m.close();
}
}
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
Thread t=new Thread(r);
t.start();
}
}
);
frame.pack();
frame.setVisible(true);
}
}
