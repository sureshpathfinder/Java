import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MouseTest extends Applet implements MouseListener,MouseMotionListener
{
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent e)
{
showStatus("mouse clicked at "+e.getX()+","+e.getY());
}
public void mouseEntered(MouseEvent e)
{
showStatus("mouse entered at "+e.getX()+","+e.getY());
for(int i=0;i<1000000;++i);
}
public void mouseExited(MouseEvent e)
{
showStatus("mouse exited at"+e.getX()+","+e.getY());
}
public void mousePressed(MouseEvent e)
{
showStatus("mouse pressed at"+e.getX()+","+e.getY());
}
public void mouseReleased(MouseEvent e)
{
showStatus("mouse released at"+e.getX()+","+e.getY());
}
public void mouseDragged(MouseEvent e)
{
showStatus("mouse dragged at"+e.getX()+","+e.getY());
}
public void mouseMoved(MouseEvent e)
{
showStatus("mouse moved at"+e.getX()+","+e.getY());
}
}
//<applet code="MouseTest.class" width=500 height=500></applet>