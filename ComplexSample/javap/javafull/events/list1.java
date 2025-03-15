//<applet code=list1  height=300 width=300></applet>

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class list1  extends Applet implements
 ItemListener,ActionListener
{

List l;

Button b1,b2;

TextField t1,t2;

public void init()
{
t1=new TextField(10);
t2=new TextField(10);
b1=new Button("Add");
b2=new Button("Remove");

l=new List(4,true);

add(t1);
add(t2);
add(b1);
add(b2);
add(l);

l.addItemListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
t1.requestFocus();
}       

public void itemStateChanged(ItemEvent e)
{
t1.setText(l.getSelectedItem());
t2.setText(""+l.getSelectedIndex());
} 
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand()=="Add")
{
l.addItem(t1.getText());
t1.requestFocus();
t1.setText("");
t2.setText(""+l.getItemCount());
}
else
{
l.remove(l.getSelectedIndex());
//l.removeAll();
t2.setText(""+l.getItemCount());
}
}
}
