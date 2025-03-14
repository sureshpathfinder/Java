import java.applet.*;
import java.awt.*;
import java.beans.Beans;
import java.awt.event.*;
public class Text1 extends Applet implements ActionListener
{
NewTextArea text;
Piechart p;
ClassLoader m;
Button prev=new Button("Prev");
Button next=new Button("Next");
public void init()
{
try
{
m=this.getClass().getClassLoader();
text=(NewTextArea)Beans.instantiate(m,"NewTextArea");
p=(Piechart)Beans.instantiate(m."Piechart");
add(p);
add(text);
add(prev);
add(next);
prev.addActionListener(this);
next.addActionListener(this);
text.setEditable(false);
}
catch(Exception e)
{
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand()=="prev")
{
p.setVisible(false);
text.setVisible(true);
}
else if(e.getActionCommand()=="Next")
{
text.setVisible(false);
p.setVisible(true);
}
}
}
//<applet code="Text1.class" height=500 width=500></applet>