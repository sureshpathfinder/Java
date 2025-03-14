import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ButtonTest extends Applet
{
Label lb1=new Label("Button1");
Button b1=new Button("ok");
Label lb2=new Label("Button2");
Button b2=new Button("cancel");
public void init()
{
setLayout(new FlowLayout());
b1.addActionListener(new B1());
b2.addActionListener(new B2());
add(lb1);
add(b1);
add(lb2);
add(b2);
}
class B1 implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
getAppletContext().showStatus("Button1: ok clicked");
}
}
class B2 implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
getAppletContext().showStatus("Button2: cancel clicked");
}
}
}
//<applet code="ButtonTest.class" width=500 height=500></applet>

