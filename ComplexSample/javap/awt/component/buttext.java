import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class buttext extends Applet implements ActionListener
{
 Button b1,b2;
 TextField t1;
 public void init()
 {
   setLayout(new FlowLayout());
  b1 = new Button("Hello");
  b2 = new Button("Welcome");
  t1 = new TextField(15);
  add(t1);
  add(b1); 
  add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==b1)
  {
   t1.setText(b1.getLabel());
  }
  else
  {
   t1.setText(b2.getLabel());
  }
 }
}

//<applet code="buttext.class" width=400 height=400></applet>