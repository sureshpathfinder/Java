//<applet code=checkbox1 height=200 width=200></applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class checkbox1 extends Applet implements ItemListener
{
Checkbox c1,c2,c3;
CheckboxGroup cg;
TextField t1;

public void init()
{
t1=new TextField(10);


cg=new CheckboxGroup();

c2=new Checkbox("red",cg,false);
c3=new Checkbox("blue",cg,false);
c1=new Checkbox("green",cg,false);

add(c1);
add(c2);
add(c3);

add(t1);


c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);

}
public void itemStateChanged(ItemEvent e)
{
int a=20;
String s;
s=(String)e.getItem();
if(s.equals("red"))
{
t1.setText(""+s);
}
else if(s.equals("blue"))
{
t1.setText(""+s);
}

else
{
t1.setText(""+s);
}
}
}


