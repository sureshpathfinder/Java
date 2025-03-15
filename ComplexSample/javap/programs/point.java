import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="point" width=300 height=300></applet>*/
public class point extends Applet implements ActionListener
{
Point p;
Image img;
public void init()
{
img=getImage(getDocumentBase(),"images.jpg");
p=getLocation();
Button b=new Button("Move");
add(b);
b.addActionListener(this);
}
public void paint(Graphics g)
{
int x=(int)p.getX();
int y=(int)p.getY();
g.drawImage(img,x,y,this);
}
public void actionPerformed(ActionEvent ae)
{
p.move(100,100);
repaint();
}
}