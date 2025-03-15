//<applet code=choice  height=300 width=300></applet>

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class choice  extends Applet implements
                          ItemListener,ActionListener
{
int ind=0;
Choice c;
TextField t1,t2;
Button b1,b2;

public void init()
{
t1=new TextField(10);
t2=new TextField(5);

c=new Choice();

b1=new Button("add");
b2=new Button("remove");

c.addItem("india");
c.addItem("pakistan");
c.addItem("srilanka");

add(t1);
add(t2);
add(c);
add(b1);
add(b2);

b1.addActionListener(this);
b2.addActionListener(this);
c.addItemListener(this);
}

public void actionPerformed(ActionEvent ae)
{
      if(ae.getSource()==b1)
{
c.addItem(t1.getText());
}
else
{
c.remove(c.getSelectedItem());
}
}


public void itemStateChanged(ItemEvent e)
{
showStatus("item state is changed");
t1.setText(c.getSelectedItem());
t2.setText(""+c.getSelectedIndex());
} 
}


