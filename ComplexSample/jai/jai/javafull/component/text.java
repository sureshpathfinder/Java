import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class text extends Applet implements ActionListener
{
TextField n,p;

public void init()
{
Label lp1=new Label("Name: ");
Label lp2=new Label("Password: ");
n=new TextField(20);
p=new TextField(10);
p.setEchoChar('#');
add(lp1);
add(n);
add(lp2);
add(p);
n.addActionListener(this);
p.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
repaint();
}

public void paint(Graphics g)
{
g.drawString("Name :      "+n.getText(),50,100);
g.drawString("Selected Text:    "+n.getSelectedText(),50,150);
g.drawString("Password :     "+p.getText(),50,200);
}
}
//<applet code="text" width=400 height=350></applet>

