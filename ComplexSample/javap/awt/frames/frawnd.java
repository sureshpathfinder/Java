import java.awt.*;
import java.awt.event.*;

public class frawnd extends Frame implements ActionListener
{
 TextField t1;
 Button b1;
 frawnd()
 {
  setVisible(true);
  setTitle("Frame Window");
  setSize(400,400);
  setLayout(new FlowLayout());
  t1 = new TextField(15);
  b1 = new Button("hello");
  add(t1);
  add(b1);
  b1.addActionListener(this);
addWindowListener(new WindowAdapter()
 {
public void windowClosing(WindowEvent we)
   {
   System.exit(0);
   }
  });
 }
public void actionPerformed(ActionEvent ae)
 {
  t1.setText(b1.getLabel());
 }
 public static void main(String args[])
 { 
  frawnd f= new frawnd();
  f.show();
 }
}



