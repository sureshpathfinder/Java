import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Applets extends JApplet
{
JButton but;
public void init()
{
JPanel c=(JPanel)getContentPane();
but=new JButton("Displayed in an applet");
c.add(but);
}
}
//<applet code="Applets.class" width=250 height=250></applet>