import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Aa.class" height=500 width=500></applet>*/
public class Aa extends Applet implements ActionListener
{
TextField a=new TextField();
TextField b=new TextField();
TextField c=new TextField();
Button d=new Button("add");
Button e=new Button("sub");
public void init()
{
setLayout(null);
setBackground(Color.blue);
d.addActionListener(this);
e.addActionListener(this);
a.setBounds(30,30,70,20);
b.setBounds(30,110,70,20);
c.setBounds(30,190,70,20);
d.setBounds(30,270,30,20);
e.setBounds(70,270,30,20);
add(a);
add(b);
add(c);
add(d);
add(e);
}
public void actionPerformed(ActionEvent e1)
{
if(e1.getSource()==d)
{
int c1=Integer.parseInt(a.getText())+Integer.parseInt(b.getText());
c.setText(String.valueOf(c1));
}
if(e1.getSource()==e)
{
int c1=Integer.parseInt(a.getText())-Integer.parseInt(b.getText());
c.setText(String.valueOf(c1));
}
}
}



