//<applet code=mouse2 height=300 width=300></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mouse2 extends Applet implements MouseMotionListener
{

public void init()
{
addMouseMotionListener(this);

}

public void mouseMoved(MouseEvent e)
{
showStatus("mouse moved "+ "x = " +e.getX()+" y = "+e.getY());
}

public void mouseDragged(MouseEvent e)
{
showStatus("mouseDragged " + "x = "+e.getX()+" y = "+e.getY());
}

}





