//<applet code=key height=300 width=300></applet>

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class key extends Applet implements
          KeyListener
{

String s=null;

TextField t1,t2,t3;

public void init()
{
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
t2.setEchoChar('*');

add(t1);
add(t2);
add(t3);


t1.addKeyListener(this);
t2.addKeyListener(this);
}

public void keyPressed(KeyEvent e)
{
showStatus("Key pressed");
}
public void keyReleased(KeyEvent e)
{
showStatus("Key Released ");
}
public void keyTyped(KeyEvent e)
{
s+=e.getKeyChar();

for(int i=0;i<900000;i++);
{
t1.setText(s);
t2.setText(s);
t3.setText(t2.getText());
showStatus("Key Typed");
}
//for(int i=0;i<900000;i++);
}
}
                
