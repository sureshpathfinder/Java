//<applet code=mouse1 height=300 width=300></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mouse1 extends Applet implements
        MouseListener
{
public void init()                      
{
addMouseListener(this);
}

public void mouseEntered(MouseEvent e)
{
showStatus("Mouse Entered ");
}

public void mousePressed(MouseEvent e)
{
showStatus("Mouse Pressed ");

}

public void mouseReleased(MouseEvent e)
{
showStatus("Mouse Released");

}

public void mouseClicked(MouseEvent e)
{
showStatus("mouse clicked");
}

public void mouseExited(MouseEvent e)
{
showStatus("mouse Exited");
}



}

