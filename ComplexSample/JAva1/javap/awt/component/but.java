import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class but extends Applet implements ActionListener
{
 Button b1;
 TextField t1;
 public void init()
 {
  b1 = new Button("Hello");
  t1 = new TextField(15);
  add(t1);
  add(b1);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
  t1.setText(b1.getLabel());
 }
}

//<applet code="but.class" width=400 height=400></applet>

 
