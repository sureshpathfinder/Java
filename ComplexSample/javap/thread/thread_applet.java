import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class thread_applet extends Applet implements ActionListener,Runnable
{
 Button b1,b2,b3,b4,b5;
 TextArea t1;
 Thread t;
  public void init()
 {
   setLayout(new FlowLayout());
  b1 = new Button("Start");
  b2 = new Button("stop");
  b3 = new Button("suspend");
  b4 = new Button("resume");
   b5 = new Button("sleep");
  t1 = new TextArea(15,3);
  add(t1);
  add(b1); 
  add(b2);
  add(b3);add(b4);add(b5);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
   b5.addActionListener(this);

  t=new Thread(this);
  
 }  
  
public void actionPerformed(ActionEvent e)
{
  
  if(e.getSource()==b1)
  {       
   // thread1 t=new thread1();
    t.start();
  }
  if(e.getSource()==b2)
  {
    t.stop();     
  }
 if(e.getSource()==b3)
  {
    t.suspend();     
  }  
   if(e.getSource()==b4)
  {
    t.resume();     
  }
    if(e.getSource()==b5)
  {
      try
      {
        t.sleep(100000);    
      }
       catch (InterruptedException er)
       {
               System.out.println(er);   
       } 
      
  }
}
public void run()
{
  for(int i=0;i<10;i++)
  {
    t1.append(i+"  ");
    try
    {
      t.sleep(500);
    }
    catch (InterruptedException e)
    {
      System.out.println(e);
    } 
  }  
}
}
//<applet code="buttext.class" width=400 height=400></applet>