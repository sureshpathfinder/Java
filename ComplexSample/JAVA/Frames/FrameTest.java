import java.awt.*;
import java.applet.*;
import java.awt.event.*;
class MyFrame extends Frame
{
boolean a;
MyFrame()
{
a=false;
addWindowListener(new W());
}
class W extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
try
{
setVisible(false);
dispose();
System.exit(0);
}
catch(Exception g)
{
}
}
}

public class FrameTest extends Applet
{
int num=0;
public void init()
{
Button b=new Button("create window");
b.addActionListener(new B());
add(b);
}
class B implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
MyFrame mf=new MyFrame();
mf.setSize(300,200);
mf.setVisible(true);
mf.setTitle("window-"+num);
++num;
}
}
}
}
//<applet code="FrameTest.class" height=500 width=500></applet>
