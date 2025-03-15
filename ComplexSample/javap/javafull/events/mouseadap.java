import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class mouseadap extends Applet 
{

public void init()
{
addMouseListener(new m());
}


class m extends MouseAdapter
{
public void mousePressed(MouseEvent e)
{
showStatus("Mouse Clicked : "+e.getX()+","+e.getY());
}
}
}

//<applet code="mouseadap.class" width=400 height=400></applet>

