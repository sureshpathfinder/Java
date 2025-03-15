import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="font" width=500 height=500>
</applet>
*/
public class font extends Applet implements ActionListener
{
Label l1,l2;
Button b1;
TextField t1,t2;
Font f;
String str=" ";
String str1=" ";
String str2=" ";

public void init()
{

f=new Font("Times New Roman", Font.ITALIC,24);
setFont(f);
setBackground(Color.YELLOW);
setForeground(Color.RED);
l1=new Label("LOGIN NAME");
l2=new Label("SECRET CODE");
t1=new TextField(30);
t2=new TextField(30);
t2.setEchoChar('*');
b1=new Button("click");
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
b1.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
str1=t1.getText();
str2=t2.getText();
if(str2.equals("applet"))
{
str="valid username";
}
else
{
str=" try again";
}
repaint();
}

public void paint(Graphics g)
{
g.drawString(str,100,300);
}
}
