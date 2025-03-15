import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class menu extends Frame implements ActionListener
{
Button b1,b2;
Frame f=new Frame("ss");
menu(String t)
{
super(t);
MenuBar mbar=new MenuBar();
Menu file=new Menu("File");
MenuItem it1,it2;
file.add(it1=new MenuItem("Ok"));
file.add(it2=new MenuItem("Cancel"));
mbar.add(file);
setMenuBar(mbar);
it1.addActionListener(this);
it2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
Dialog fd=new Dialog(f,"Dialog Box");
String arg=(String)ae.getActionCommand();
if(arg.equals("Ok"))
{
fd.add(new Button("Ok Pressed"));
fd.setVisible(true);
fd.setSize(200,100);
}
else if(arg.equals("Cancel"))
{
fd.add(new Button("Cancel Pressed"));
fd.setSize(200,100);
fd.setVisible(true);
}
}
}
public class menudemo extends Applet
{
Frame f;
public void init()
{
f=new menu("Menu Dialog");
f.setSize(200,200);
f.setVisible(true);
}
public void start()
{
f.setVisible(true);
}
}
//<applet code="menudemo" width=200 height=300></applet>