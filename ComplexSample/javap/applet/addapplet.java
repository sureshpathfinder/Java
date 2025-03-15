import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="addapplet" width=500 height=500>
</applet>
*/

public class addapplet extends Applet implements ActionListener
{
TextField t1;
TextField t2;
Button b1;
Button b2;
Button b3;
Button b4;
String str=""; 
String str1="";
Font f1;
int c=0;
char ch;
public void init()
{
//setLayout(null);
f1=new Font("Arial Black",Font.ITALIC,36);
setFont(f1);
setBackground(Color.RED);
setForeground(Color.BLACK);
t1=new TextField(6);
t2=new TextField(6);
b1=new Button("Add");
b2=new Button("Sub");
b3=new Button("Multi");
b4=new Button("Div");
str1 = t1.getText();
int len = str1.length();
for(int i=0;i<len;i++)
ch = str.charAt(i);
if(ch>='0'&&ch<='9')
str = "do not enter the value"; 
/*b1.setBounds(100,10,200,20);
b2.setBounds(200,20,190,40);
b3.setBounds(300,30,180,60);
b4.setBounds(400,40,170,80);
t1.setBounds(500,50,160,100);
t2.setBounds(600,60,150,120);*/

add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
str=e.getActionCommand();
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
if(str.equals("Add"))
c=a+b;
if(str.equals("Sub"))
c=a-b;
if(str.equals("Multi"))
c=a*b;
if(str.equals("Div"))
c=a/b;
str1=String.valueOf(c);
repaint();
}

public void paint(Graphics g)
{
g.drawString(str1,100,200);
}
}
