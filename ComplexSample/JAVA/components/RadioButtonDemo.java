import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class RadioButtonDemo extends Applet
{
public void init()
{
CheckboxGroup c=new CheckboxGroup();
Checkbox c1=new Checkbox( "JAVA",c,true);
Checkbox c2=new Checkbox("J2EE",c,false);
c1.addMouseListener(new Check1());
c2.addMouseListener(new Check2());
add(c1);
add(c2);
Choice abc=new Choice();
abc.add("Mathematics");
abc.add("Physics");
abc.add("Chemistry");
abc.add("Computer Science");
abc.addItemListener(new Ch());
add(abc);
}
class Check1 extends MouseAdapter
{
public void mouseClicked(MouseEvent e)
{
showStatus("u have clicked JAVA");
}
}
class Check2 extends MouseAdapter
{
public void mouseClicked(MouseEvent e)
{
showStatus("u have clicked J2EE");
}
}
class Ch implements ItemListener
{
public void itemStateChanged(ItemEvent e)
{
showStatus("u have choosed"+e.getItem());
}
}
}
//<applet code="RadioButtonDemo.class" height=500 width=500></applet> 