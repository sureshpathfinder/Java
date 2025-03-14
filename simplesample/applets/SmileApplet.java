import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class SmileApplet extends Applet implements MouseMotionListener
{
public void init()
{
addMouseMotionListener(this);
}
public void paint(Graphics g)
{
Font f=new Font("Helvetica",Font.BOLD,20);
g.setFont(f);
g.drawString("Always keep smiling !!",50,30);
g.drawOval(60,60,200,200);
g.fillOval(90,120,50,20);
g.fillOval(190,120,50,20);
g.drawLine(165,125,165,175);
g.drawArc(110,130,95,95,0,-180);
g.drawLine(165,175,150,160);
}
public void mouseMoved(MouseEvent e)
{
showStatus(" "+e.getX()+","+e.getY());
}
public void mouseDragged(MouseEvent e)
{
}
}
/*<applet code="SmileApplet.class" width=500 height=500></applet>*/